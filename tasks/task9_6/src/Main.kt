// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: kotlin run <filename>")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        println("Dataset size: ${data.size}")

        val varianceValue = variance(data)
        println("Variance: ${"%.5f".format(varianceValue)}")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
        exitProcess(1)
    } catch (e: Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
