import com.strumenta.antlrjava.parsers.generated.JavaCounterLexer
import com.strumenta.antlrjava.parsers.generated.JavaCounterListener
import com.strumenta.antlrjava.parsers.generated.JavaCounterParser
import com.strumenta.antlrkotlin.parsers.generated.CounterLexer
import com.strumenta.antlrkotlin.parsers.generated.CounterParser
import org.antlr.v4.kotlinruntime.CharStreams
import org.antlr.v4.kotlinruntime.CommonTokenStream
import org.antlr.v4.kotlinruntime.tree.ParseTreeWalker

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction
import java.io.File

data class Statistic(
    val totalLines: Int = 0,
    val totalClasses : Int = 0,
    val totalMethods : Int = 0,
)
fun serializeToJson(statistic: Statistic): String {
    return """
        {
            "totalLines": ${statistic.totalLines},
            "totalClasses": ${statistic.totalClasses},
            "totalMethods": ${statistic.totalMethods}
        }
    """.trimIndent()
}

class CustomPlugin : Plugin<Project>{
    override fun apply(target: Project) {
        target.tasks.register("Analyze",StatisticTask::class.java)
        target.tasks.named("build").configure(){
            dependsOn("Analyze")
        }
    }
}

abstract class StatisticTask(): DefaultTask(){
    @TaskAction
    fun analyzeStatistic(){
        val analyzeDir: String = "src"
        val jsonPath : String = analyzeDir+"/json"
        val srcDir = File(analyzeDir)
        val statistics = analyzeSourceDirectory(srcDir)
        val jsonDir = File(jsonPath).mkdir()
        val json= File(jsonPath+"/jsonResult.json")
        json.writeText(serializeToJson(statistics))
    }

    private fun analyzeSourceDirectory(dir:File):Statistic{
        var totalClasses : Int = 0
        var totalMethods : Int = 0
        var totalLines: Int = 0
        dir.walk().forEach { file ->
            if( file.extension == "kt" ){
                val lines = file.readLines()
                totalLines += lines.size
                val lexer = CounterLexer(CharStreams.fromString(file.readText()))
                val tokens = CommonTokenStream(lexer)
                val parser = CounterParser(tokens)
                val tree = parser.kotlinFile()
                val listener =KotlinCounterListener()
                ParseTreeWalker.DEFAULT.walk(listener,tree)
                totalClasses+=listener.classCount
                totalMethods+=listener.methodsCount
            }
            if( file.extension == "java" ){
                val lines = file.readLines()
                totalLines += lines.size
                val lexer = JavaCounterLexer(CharStreams.fromString(file.readText()))
                val tokens = CommonTokenStream(lexer)
                val parser = JavaCounterParser(tokens)
                val tree = parser.javaFile()
                val listener =JavaCounterListener()
                ParseTreeWalker.DEFAULT.walk(listener,tree)
                totalClasses+=listener.classCount
                totalMethods+=listener.methodsCount
            }
        }
        return Statistic(totalLines,totalClasses,totalMethods)
    }
}