// Task 5.1.1: main program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: ./kotlin run <first> <second>")
        exitProcess(1)
    }

    val first = args[0]
    val second = args[1]

    val isAnagram = anagrams(first, second)
    println("$first and $second are anagrams: $isAnagram")
}
