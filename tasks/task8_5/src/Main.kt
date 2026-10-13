// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here

    val testString = "Hello, World!"
    val countVowels = testString.howMany{it in "aeiouAEIOU"}
    println("Number of vowels in '$testString': $countVowels")

    val countDigits = testString.howMany{it.isDigit()}
    println("Number of digits in '$testString': $countDigits")
}
