package de.shinythings.gettingstartedwithkotlin.shoppingcart.usecase

import de.shinythings.gettingstartedwithkotlin.shoppingcart.model.*
import java.util.*

class AddItemToShoppingCart(private val cart: ShoppingCart, private val productCatalog: ProductCatalog): UseCase<AddItemToShoppingCartRequest> {
    override fun invoke(request: AddItemToShoppingCartRequest) {
        val product = this.productCatalog[ProductId(UUID.fromString(request.itemId))]
        this.cart.add(product)
    }
}

data class AddItemToShoppingCartRequest(val itemId: String, val amount: Int)
