// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: expected 2 arguments but got ${args.size}")
        println("Usage: ./kotlin run <arg1> <arg2>")
        exitProcess(1)
    }

    println("First argument: ${args[0]}")
    println("Second argument: ${args[1]}")
}
