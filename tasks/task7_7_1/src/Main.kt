// Task 7.7.1: program to compute stats for a numeric dataset

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: task7_7_1 <data file>")
        exitProcess(1)
    }

    val data = readData(args[0])

    // TODO: display the statistics for data
    displayStats(data)
}
