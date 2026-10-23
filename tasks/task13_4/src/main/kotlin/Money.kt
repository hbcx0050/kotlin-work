// Task 13.4: Money class

data class Money(val euros: Int, val cents: Int){
    init {
        require(euros >= 0) { "Euros cannot be negative" }
        require(cents in 0..99) { "Cents must be between 0 and 99" }
    }

    operator fun plus(other: Money): Money {
        val totalCents = this.cents + other.cents
        val carryOverEuros = totalCents / 100
        val newCents = totalCents % 100
        val newEuros = this.euros + other.euros + carryOverEuros
        return Money(newEuros, newCents)
    }
}

