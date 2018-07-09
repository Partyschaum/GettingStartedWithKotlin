package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

data class Price(val amount: Int = 0) {
    operator fun plus(increment: Int): Price {
        return Price(this.amount + increment)
    }

    operator fun plus(increment: Price): Price {
        return Price(this.amount + increment.amount)
    }

    operator fun minus(decrement: Int): Price {
        val newPrice = this.amount - decrement
        if (newPrice < 0) throw NegativePriceException()
        return Price(newPrice)
    }

    operator fun minus(decrement: Price): Price {
        val newPrice = this.amount - decrement.amount
        if (newPrice < 0) throw NegativePriceException()
        return Price(newPrice)
    }
}

class NegativePriceException : RuntimeException()
