// Task 4.7: finding the longest line in a file

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: ./kotlin run <filename>")
        exitProcess(1)
    }

    val path = Path(args[0])
    var lineNumber = 0
    var longestLineNumber = 0
    var longestLength = 0

    path.forEachLine { line ->
        lineNumber += 1
        if (line.length > longestLength) {
            longestLength = line.length
            longestLineNumber = lineNumber
        }
    }

    println("Line $longestLineNumber is the longest (length = $longestLength)")
}
