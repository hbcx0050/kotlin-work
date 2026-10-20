// Task 12.8.1: demo program for Day enum class

fun main() {
    print("Enter a day: ")
    val input = readln()

    try {
        val day = Day.valueOf(input)
        println("You entered $day")
    } catch (error: IllegalArgumentException) {
        val listOfDays = Day.entries.joinToString(", ") { it.name }
        println("Invalid day entered. Valid days are: $listOfDays")
    }
}
