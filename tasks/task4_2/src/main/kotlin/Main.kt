// Task 4.2: use of if and ranges

fun main() {
    println("Pizza menu")
    println("  a) Margherita")
    println("  b) Pepperoni")
    println("  c) Hawaiian")
    println("  d) Vegetarian")
    print("Enter your choice: ")

    val choice = readln().lowercase()

    if (choice.length == 1 && choice[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }
}
