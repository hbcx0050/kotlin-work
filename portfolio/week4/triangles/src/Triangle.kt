// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

fun isValidTriangle(triangle: Triple<Double, Double, Double>):Boolean{
    val (a,b,c) = triangle

    return (a+b > c) && (a+c > b)&&(b+c > a)
}

class Triangle(val sideA:Double, val sideB:Double, val sideC:Double){
    init {
        require(isValidTriangle(Triple(sideA, sideB, sideC))){"Doesnt form a valid triangle"}
    }

    override fun toString():String{
        return "Triangle($sideA, $sideB, $sideC)"
    }

    val area:Double get() = sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC))
    val perimeter:Double get() = sideA + sideB + sideC
    val semiPerimeter:Double get() = perimeter / 2
}