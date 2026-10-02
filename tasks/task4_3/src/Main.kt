// Task 4.3: grade calculation using a when expression

import kotlin.math.roundToInt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: three marks required on the command line")
        exitProcess(1)
    }

    val mark1 = args[0].toDouble()
    val mark2 = args[1].toDouble()
    val mark3 = args[2].toDouble()

    val average = ((mark1 + mark2 + mark3) / 3).roundToInt()
    println("Average mark: $average")

    when (average) {
        in 70..100 -> println("Grade: Distinction")
        in 40..69 -> println("Grade: Pass")
        in 0..39 -> println("Grade: Fail")
        else -> println("Error: average must be between 0 and 100")
    }
}
