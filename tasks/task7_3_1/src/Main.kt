// Task 7.3.1: list element access

fun main() {
    val numbers = listOf(9, 3, 6, 2, 8, 5)
    println(numbers)
    println(numbers[0])
    // println(numbers[10])  // step 2: throws ArrayIndexOutOfBoundsException at runtime
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())
    // numbers[0] = 1        // step 5: does not compile, List has no set operator
    // numbers.add(1)        // step 6: does not compile, List has no add()
}
