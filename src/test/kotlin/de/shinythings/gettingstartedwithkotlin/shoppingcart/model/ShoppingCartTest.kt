package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.matchers.collections.shouldNotContain
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ShoppingCartTest : StringSpec({
    "add product to cart" {
        val cart = ShoppingCart()
        val product = Product(ProductId(), "Coffee", Price(6999))
        cart.add(product)
        cart.products.shouldContain(product)
    }

    "remove product from cart" {
        val cart = ShoppingCart()
        val item = Product(ProductId(), "Coffee", Price(6999))
        cart.add(item)
        cart.remove(item)
        cart.products.shouldNotContain(item)
    }

    "calculate total" {
        val cart = ShoppingCart()
        val product1 = Product(ProductId(), "Coffee", Price(6999))
        val product2 = Product(ProductId(), "Chocolate", Price(999))
        cart.add(product1)
        cart.add(product2)
        cart.total.shouldBe(Price(6999) + Price(999))
    }
})
