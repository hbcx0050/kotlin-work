// Task 13.5: unit tests for CurrencyConverter
// (using a stub for ExchangeRateService)

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.mockk

const val tolerance = 0.00001

class CurrencyConverterTest : FreeSpec({
    val service = mockk<ExchangeRateService>()

    every{service.updateRates()} just Runs
    every{service.rateFor("GBP")} returns 1.0
    every{service.rateFor("USD")} returns 1.25
    every{service.rateFor("JPY")} returns 190.0

    val conv = CurrencyConverter(service)

    "Convert GBP to JPY" {
        conv.convertTo("JPY", 1.5) shouldBe (190.0 * 1.5 plusOrMinus tolerance)
    }
    "Convert GBP to USD" {
        conv.convertTo("USD", 1.5) shouldBe (1.25 * 1.5 plusOrMinus tolerance)
    }
    "Convert GBP to GBP" {
        conv.convertTo("GBP", 1.5) shouldBe (1.0 * 1.5 plusOrMinus tolerance)
    }
})
