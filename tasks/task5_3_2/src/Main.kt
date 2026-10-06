// Task 5.3.2: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Usage: ./kotlin run <dice spec, e.g. 3d6>")
        exitProcess(1)
    }

    val diceSpec = args[0].split("d")
    val numberOfDice: Int = diceSpec[0].toInt()
    val numberOfSides: Int = diceSpec[1].toInt()

    rollDice(numberOfDice, numberOfSides)
}
