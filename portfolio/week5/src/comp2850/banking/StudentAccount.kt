package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder:String):BankAccount(holder){
    var overdraft: Int = 0 
    set(value) {
        require(value in 0..MAX_OVERDRAFT) {"overdraft must be between 0 and $MAX_OVERDRAFT"}
        field = value
    }
    override fun withdraw(amount:Int){
        require(amount>0){"Withdrawal amount must be greater than 0"}
        val newBalance = balance - amount
        require(newBalance >= -overdraft){"Insufficient funds for withdrawal"}

        balance = newBalance
    }
    override fun toString():String{
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }
}