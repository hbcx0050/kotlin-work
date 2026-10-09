// Task 7.7.1: statistics functions

// TODO: a function that computes the median of a list of floats
//       (the calculation differs for odd and even list sizes)
fun median(data: List<Float>):Float{
    val sortedList = data.sorted()
    var middleIndex = sortedList.size / 2

    if (sortedList.size % 2 == 0){
        return (sortedList[middleIndex - 1] + sortedList[middleIndex]) / 2
    } else {
        return sortedList[middleIndex]
    }
}

// TODO: a function that displays the minimum, maximum, mean and median
//       of a list of floats, using the median function above
fun displayStats(data: List<Float>){
    val min = data.min()
    val max = data.max()

    println("The minimum is: $min")
    println("The maximum is: $max")
    println("The mean is: ${data.average()}")
    println("The median is: ${median(data)}")
}