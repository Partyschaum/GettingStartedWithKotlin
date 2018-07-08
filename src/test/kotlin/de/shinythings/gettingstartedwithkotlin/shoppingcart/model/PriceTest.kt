package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

import io.kotlintest.shouldBe
import io.kotlintest.shouldThrowExactly
import io.kotlintest.specs.StringSpec

class PriceTest : StringSpec({
    "initializes with an integer value" {
        Price(1000).amount.shouldBe(1000)
    }

    "addition works with integer" {
        (Price(1000) + 500).shouldBe(Price(1500))
    }

    "addition works with price object" {
        (Price(1000) + Price(2000)).shouldBe(Price(3000))
    }

    "subtraction works with integer" {
        (Price(1000) - 500).shouldBe(Price(500))
    }

    "subtraction works with price object" {
        (Price(2500) - Price(1000)).shouldBe(Price(1500))
    }

    "subtraction throws NegativePriceException" {
        shouldThrowExactly<NegativePriceException> { (Price(500) - 501) }
    }
})

