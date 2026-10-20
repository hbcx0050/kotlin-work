// Task 12.4.1: main program

fun main() {
    try {
        Circle(Point(0.0, 0.0), -1.0)
    } catch (e: IllegalArgumentException) {
        println("Negative radius rejected: ${e.message}")
    }

    val circle = Circle(Point(0.0, 0.0), 2.0)
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val points = listOf(Point(1.0, 1.0), Point(3.0, 0.0), Point(2.0, 0.0))
    for (p in points) {
        println("Contains (${p.x}, ${p.y}): ${circle.contains(p)}")
    }
}
