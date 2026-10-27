// Task 15.2.3: demo program

fun main() {
    // Write code to demonstrate the classes here
    val savingsAcc = SavingsAccount("John Doe", 1.8)
    savingsAcc.deposit(1250)

    for (i in 1..5) {
        savingsAcc.applyInterest()
    }

    savingsAcc.withdraw(50)

    println("Balance after applying interest 5 times and withdrawing 50: ${savingsAcc.balance}")
}
