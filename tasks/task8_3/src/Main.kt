// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: kotlin run <filename>")
        exitProcess(1)
    }

    // TODO: read the data from args[0] using fetchData(), then display
    // the lowest-temperature station, the highest-temperature station,
    // and the average temperature across all stations.
    val data = fetchData(args[0])

    val coldestStation = data.minBy{it.second}
    val warmestStation = data.maxBy{it.second}
    val averageTemp = data.sumOf{it.second} / data.size

    println("Coldest station: ${coldestStation?.first} with temperature ${coldestStation?.second}")
    println("Warmest station: ${warmestStation?.first} with temperature ${warmestStation?.second}")
    println("Average temperature: $averageTemp")

    
}
