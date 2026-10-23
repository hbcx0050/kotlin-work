// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

fun isValidTriangle(triangle: Triangle):Boolean{
    val (a,b,c) = triangle

    return (a+b > c) && (a+c > b)&&(b+c > a)
}

fun triangleArea(triangle: Triangle):Double{
    if (!isValidTriangle(triangle)){
        throw IllegalArgumentException("The triangle is invalid")
    }
    //require(isValidTriangle(triangle)){"The triangle is invalid"}

    val (a,b,c) = triangle
    val s = (a+b+c)/ 2.0

    return sqrt(s*(s-a)*(s-b)*(s-c))
}