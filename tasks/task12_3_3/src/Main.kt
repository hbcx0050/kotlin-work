// Task 12.3.3: demo of Person class with secondary constructor

fun main() {
    val person = Person("John Doe", "1990-05-15")
    println("${person.name} ${person.birth} ${person.isMarried}")

    val newPerson = Person("", "1990-05-15")
    val newPerson2 = Person(" ", "1990-05-15")
}
