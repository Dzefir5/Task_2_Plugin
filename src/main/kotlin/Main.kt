package org.example

import java.io.File




fun main(){
    val inputFile = File("src/main/kotlin/Example.kt")
    val input = inputFile.readText()
    println(input)

}