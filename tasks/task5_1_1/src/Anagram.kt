// Task 5.1.1: anagrams() function

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) return false
    return first.lowercase().toList().sorted() ==
           second.lowercase().toList().sorted()
}
