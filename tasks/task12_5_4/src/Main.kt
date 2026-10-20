// Task 12.5.4: demo program for class with a computed property

import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("Joe Bloggs", LocalDate(1997, 8, 23))
    println("${person.name} is ${person.age}")

    val almost = Person("Jane Doe", LocalDate(1997, 10, 21))
    println("${almost.name} is ${almost.age}")
}
