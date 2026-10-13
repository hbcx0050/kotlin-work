// Task 8.5: example of a higher-order function

fun String.howMany(include: (Char) -> Boolean):Int{
    return this.count{include(it)}
}