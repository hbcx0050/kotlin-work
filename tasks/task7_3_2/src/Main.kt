// Task 7.3.2: mutable lists

fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    numbers[0] = 1
    println(numbers)
    numbers.add(1)
    println(numbers)

    numbers.add(2, 7)
    println(numbers)
    numbers.addAll(listOf(4, 4, 10))
    println(numbers)
    numbers.remove(4)
    println(numbers)
    numbers.removeAll(listOf(1, 4))
    println(numbers)
    numbers.removeAt(0)
    println(numbers)
    numbers.clear()
    println(numbers)
}
