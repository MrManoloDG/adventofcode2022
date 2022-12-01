package utils

import java.io.File

object FileReader {

    public fun readFileLines(fileName: String): List<String> {
        return File("src/main/kotlin/$fileName").readLines()
    }
}