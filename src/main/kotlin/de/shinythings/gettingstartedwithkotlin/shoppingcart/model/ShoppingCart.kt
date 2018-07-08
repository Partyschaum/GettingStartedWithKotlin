package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

class ShoppingCart {
    val products: ArrayList<Product> = ArrayList()

    val total: Price
        get() = Price(this.products.map { it.price.amount }.fold(0) { acc, item -> acc + item })

    fun add(product: Product) {
        this.products.add(product)
    }

    fun remove(product: Product) {
        this.products.remove(product)
    }
}
