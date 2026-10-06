// Task 5.1.2: rollDie() function

import kotlin.random.Random

fun rollDie(numberOfSides: Int) {
    val validSides = setOf(4, 6, 8, 10, 12, 20)
    if (numberOfSides in validSides) {
        println(Random.nextInt(1, numberOfSides + 1))
    } else {
        println("Error: invalid number of sides")
    }
}
