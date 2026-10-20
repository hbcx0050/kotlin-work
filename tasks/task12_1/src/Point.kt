// Task 12.1: Point class

import kotlin.math.hypot

class Point(val x: Double = 0.0, val y: Double = 0.0) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)
}
