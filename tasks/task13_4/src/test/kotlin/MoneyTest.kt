// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    val oneEuroFifty = Money(1, 50)
    val twoEurosNinetyNine = Money(2, 99)

    "Euros and cents stored correctly" {
        withClue("1.50") {
            oneEuroFifty.euros shouldBe 1
            oneEuroFifty.cents shouldBe 50
        }
        withClue("2.99") {
            twoEurosNinetyNine.euros shouldBe 2
            twoEurosNinetyNine.cents shouldBe 99
        }
    }

    "Exception if euros are negative" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> { Money(-1, 0) }
        }
    }
    "Exception if cents are negative" {
        withClue("-1") {
            shouldThrow<IllegalArgumentException> { Money(0, -1) }
        }
    }
    "Exception if cents are over 99" {
        withClue("100") {
            shouldThrow<IllegalArgumentException> { Money(0, 100) }
        }
    }

    "Addition of Money" {
        withClue("1.50 + 1.00") { (oneEuroFifty + Money(1, 0)) shouldBe Money(2, 50) }
        withClue("1.50 + 2.00") { (oneEuroFifty + Money(2, 0)) shouldBe Money(3, 50) }
        withClue("1.50 + 0.01") { (oneEuroFifty + Money(0, 1)) shouldBe Money(1, 51) }
        withClue("2.99 + 0.01") { (twoEurosNinetyNine + Money(0, 1)) shouldBe Money(3, 0) }
    }
})
