// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Usage: ./kotlin run <start> <max> <step>")
        exitProcess(1)
    }

    val start = args[0].toDouble()
    val max = args[1].toDouble()
    val step = args[2].toDouble()

    if (step <= 0.0) {
        println("Error: step must be greater than zero")
        exitProcess(1)
    }

    val output = table {
        align = TextAlign.RIGHT
        header {
            style = brightCyan
            row("Celsius", "Fahrenheit")
        }
        body {
            var celsius = start
            while (celsius <= max) {
                val fahrenheit = celsius * 9 / 5 + 32
                row("%.1f".format(celsius), "%.1f".format(fahrenheit))
                celsius += step
            }
        }
    }

    val term = Terminal(AnsiLevel.TRUECOLOR)
    term.println(output)
}
