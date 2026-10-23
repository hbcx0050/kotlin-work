// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median on 1 element list"{
        val data = listOf(1.0f)
        median(data) shouldBe 1.0f
    }
    "Median on 2 element list"{
        val data = listOf(1.0f, 2.0f)
        median(data) shouldBe 1.5f
    }
    "Median on 3 element list"{
        val data = listOf(1.0f, 2.0f, 3.0f)
        median(data) shouldBe 2.0f
    }
    "Median on 4 element list"{
        val data = listOf(1.0f, 2.0f, 3.0f, 4.0f)
        median(data) shouldBe 2.5f
    }
})
