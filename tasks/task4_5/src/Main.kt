// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1) {
        println("Provide one int arg")
        exitProcess(1)
    }

    val upperLimit= args[0].toInt()
    var sum = 0L

    for (i in 1..upperLimit step 2) {
        println(i)
        sum += i
    }
    
    println("$sum")
}
