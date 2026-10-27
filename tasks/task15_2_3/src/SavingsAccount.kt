// Task 15.2.3: SavingsAccount class

class SavingsAccount(holder:String, val rate:Double): BankAccount(holder){
    init {
        require(rate > 0) { "Interest rate must be greater than 0" }
    }

    fun applyInterest(){
        val interest = (balance*rate/100).toInt()
        deposit(interest)
    }
}
