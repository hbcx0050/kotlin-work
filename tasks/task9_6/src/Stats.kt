// Task 9.6: variance() function

fun variance(data:List<Double>):Double{
    require(data.size > 1){"Dataset must contain at least two values"}

    val mean = data.average()
    return data.sumOf{(it - mean) * (it - mean)} / (data.size - 1)
}