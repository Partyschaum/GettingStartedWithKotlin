package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

data class Price(val amount: Int = 0) {
    operator fun plus(increment: Int): Any {
        return Price(this.amount + increment)
    }

    operator fun plus(increment: Price): Any {
        return Price(this.amount + increment.amount)
    }

    operator fun minus(decrement: Int): Any {
        val newPrice = this.amount - decrement
        if (newPrice < 0) throw NegativePriceException()
        return Price(newPrice)
    }

    operator fun minus(decrement: Price): Any {
        val newPrice = this.amount - decrement.amount
        if (newPrice < 0) throw NegativePriceException()
        return Price(newPrice)
    }
}

class NegativePriceException : RuntimeException()
