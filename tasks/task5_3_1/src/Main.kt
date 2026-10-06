// Task 5.3.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size > 1) {
        println("Usage: ./kotlin run [<number of sides>]")
        exitProcess(1)
    }

    if (args.isEmpty()) {
        rollDie()
    } else {
        val numberOfSides = args[0].toInt()
        rollDie(numberOfSides)
    }
}
