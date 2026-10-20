// Task 12.9: demo program for class implementing Static Factory Method

import kotlinx.datetime.LocalDate

fun main() {
    val p = Person.create("Sarah", LocalDate(2005, 7, 16))
    println("Created ${p.name}, born ${p.birth}")

    val q = Person.create("Sarah", LocalDate(1999, 1, 1))
    println("Created ${q.name}, born ${q.birth}")
}
