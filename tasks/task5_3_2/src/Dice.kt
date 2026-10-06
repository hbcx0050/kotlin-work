// Task 5.3.2: rollDice() function

import kotlin.random.Random

fun rollDice(numberOfDice: Int = 1, numberOfSides: Int = 6) {
    val validSides = setOf(4, 6, 8, 10, 12, 20)
    if (numberOfSides !in validSides) {
        println("Error: invalid number of sides")
        return
    }

    var total = 0
    repeat(numberOfDice) {
        total += Random.nextInt(1, numberOfSides + 1)
    }
    println(total)
}
