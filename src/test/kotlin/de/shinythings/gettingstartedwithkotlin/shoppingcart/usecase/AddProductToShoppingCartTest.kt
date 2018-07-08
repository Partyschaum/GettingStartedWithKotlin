package de.shinythings.gettingstartedwithkotlin.shoppingcart.usecase

import de.shinythings.gettingstartedwithkotlin.shoppingcart.model.*
import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.specs.StringSpec
import usecase.AddItemToShoppingCart
import usecase.AddItemToShoppingCartRequest
import java.util.*

class AddProductToShoppingCartTest : StringSpec({
    "add item to shopping cart" {
        val randomUUID = UUID.randomUUID()
        val product = Product(ProductId(randomUUID), "Coffee", Price(6999))
        val cart = ShoppingCart()
        val addItemToShoppingCart = AddItemToShoppingCart(cart, ProductCatalog(listOf(product)))
        addItemToShoppingCart.invoke(AddItemToShoppingCartRequest(randomUUID.toString(), 1))
        cart.products.shouldContain(product)
    }

})
