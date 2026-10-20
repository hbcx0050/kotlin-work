// Task 12.4.1: Circle class

import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) { "Radius must be positive" }
    }

    fun area(): Double {
        return PI * radius * radius
    }

    fun perimeter(): Double {
        return 2 * PI * radius
    }

    fun contains(p: Point): Boolean {
        return centre.distanceTo(p) <= radius
    }
}
