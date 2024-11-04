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

val KOTLIN_CLASS_TAGS :List<String> = listOf(
    "class ",
    "data class ",
    "sealed class ",
    "open class ",
    "abstract class ",
    "inner class "
)
val KOTLIN_FUNCTION_TAGS : List<String> = listOf(
    "fun "
)
fun String.isContain(vararg tags : String): Boolean{
    tags.forEach {
        if(this.contains(it)) return true
    }
    return false
}
fun String.isContain(tags : Collection<String>): Boolean{
    tags.forEach {
        if(this.contains(it)) return true
    }
    return false
}

class CustomPlugin : Plugin<Project>{
    override fun apply(target: Project) {
        target.tasks.register("Analyze",StatisticTask::class.java)
        target.tasks.named("build").configure(){
            dependsOn("Analyze")
        }
    }
}

abstract class StatisticTask: DefaultTask(){
    @TaskAction
    fun analyzeStatistic(){
        val srcDir = File("src")
        val statistics = analyzeSourceDirectory(srcDir)
        val jsonDir = File("src/json").mkdir()
        val json= File("src/json/jsonResult.json")
        json.writeText(serializeToJson(statistics))
    }

    private fun analyzeSourceDirectory(dir:File):Statistic{
        var totalClasses : Int = 0
        var totalMethods : Int = 0
        var totalLines: Int = 0
        dir.walk().forEach { file ->
            if( file.extension == "java" || file.extension == "kt" ){
                val lines = file.readLines()
                totalLines += lines.size
                totalClasses += lines.count(){it.isContain(KOTLIN_CLASS_TAGS) }
                totalMethods += lines.count(){it.isContain(KOTLIN_FUNCTION_TAGS)}
            }
        }
        return Statistic(totalLines,totalClasses,totalMethods)
    }
}