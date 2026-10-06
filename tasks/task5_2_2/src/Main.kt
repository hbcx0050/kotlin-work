// Task 5.2.2: conversion of marks into grades, using a function

import kotlin.system.exitProcess

fun grade(mark: Int) = when {
    mark >= 70 -> "Distinction"
    mark >= 60 -> "Pass"
    else -> "Fail"
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: ./kotlin run <mark> [<mark> ...]")
        exitProcess(1)
    }

    for (arg in args) {
        val mark = arg.toInt()
        println("$mark: ${grade(mark)}")
    }
}
