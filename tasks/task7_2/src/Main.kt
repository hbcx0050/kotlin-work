// Task 7.2: array comparison

fun main() {
    val numbers = intArrayOf(9, 6, 3, 2)
    val cls = numbers::class
    println(cls.qualifiedName)
    println(cls.java)

    val x = intArrayOf(9, 3, 6, 2, 8, 5)

    // 7.2.1
    println(x[0])

    // 7.2.2
    try {
        x[6] = 0
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Warning: ${e::class.simpleName}: ${e.message}")
    }

    // 7.2.3
    println(x.slice(2..4))
}
