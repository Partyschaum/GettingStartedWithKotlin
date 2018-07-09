package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

class ShoppingCart {
    val products: ArrayList<Product> = ArrayList()

    val total: Price
        get() = this.products.fold(Price(0)) { acc, item -> acc + item.price }

    fun add(product: Product) {
        this.products.add(product)
    }

    fun remove(product: Product) {
        this.products.remove(product)
    }
}
