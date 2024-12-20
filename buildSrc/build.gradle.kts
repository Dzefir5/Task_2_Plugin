import com.strumenta.antlrkotlin.gradle.AntlrKotlinTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.9.22"
    id("com.strumenta.antlr-kotlin") version "1.0.1"
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.antlr:antlr4:4.13.1")
    implementation("com.strumenta:antlr-kotlin-runtime:1.0.1")
}
kotlin {
    jvmToolchain(21)
}
val generateKotlinGrammarSource = tasks.register<AntlrKotlinTask>("generateKotlinGrammarSource") {
    dependsOn("cleanGenerateKotlinGrammarSource")

    // ANTLR .g4 files are under {example-project}/antlr
    // Only include *.g4 files. This allows tools (e.g., IDE plugins)
    // to generate temporary files inside the base path
    source = fileTree(layout.projectDirectory.dir("antlrKotlin")) {
        include("**/*.g4")
    }

    // We want the generated source files to have this package name
    val pkgName = "com.strumenta.antlrkotlin.parsers.generated"
    packageName = pkgName

    // We want visitors alongside listeners.
    // The Kotlin target language is implicit, as is the file encoding (UTF-8)
    arguments = listOf("-visitor")

    // Generated files are outputted inside build/generatedAntlr/{package-name}
    //val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
    val outDir = "src/main/kotlin/generatedAntlr"
    outputDirectory = layout.projectDirectory.dir(outDir).asFile
}

val generateJavaGrammarSource = tasks.register<AntlrKotlinTask>("generateJavaGrammarSource") {
    // ANTLR .g4 files are under {example-project}/antlr
    // Only include *.g4 files. This allows tools (e.g., IDE plugins)
    // to generate temporary files inside the base path
    source = fileTree(layout.projectDirectory.dir("antlrJava")) {
        include("**/*.g4")
    }

    // We want the generated source files to have this package name
    val pkgName = "com.strumenta.antlrjava.parsers.generated"
    packageName = pkgName

    // We want visitors alongside listeners.
    // The Kotlin target language is implicit, as is the file encoding (UTF-8)
    arguments = listOf("-visitor")

    // Generated files are outputted inside build/generatedAntlr/{package-name}
    //val outDir = "generatedAntlr/${pkgName.replace(".", "/")}"
    val outDir = "src/main/kotlin/generatedJavaAntlr"
    outputDirectory = layout.projectDirectory.dir(outDir).asFile
}
tasks.withType<KotlinCompile> {
    dependsOn(generateJavaGrammarSource)
}
tasks.withType<KotlinCompile> {
    dependsOn(generateKotlinGrammarSource)
}
