// Task 7.7.1: statistics functions

fun median(data: List<Float>):Float{
    if (data.size <= 0){
        throw IllegalArgumentException("The list is empty")
    }

    val sortedList = data.sorted()
    var middleIndex = sortedList.size / 2

    if (sortedList.size % 2 == 0){
        return (sortedList[middleIndex - 1] + sortedList[middleIndex]) / 2
    } else {
        return sortedList[middleIndex]
    }
}

fun displayStats(data: List<Float>){
    val min = data.min()
    val max = data.max()

    println("The minimum is: $min")
    println("The maximum is: $max")
    println("The mean is: ${data.average()}")
    println("The median is: ${median(data)}")
}