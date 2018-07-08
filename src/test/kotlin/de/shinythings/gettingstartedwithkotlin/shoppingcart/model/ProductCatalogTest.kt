package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class ProductCatalogTest : StringSpec({
    "return product by ProductId" {
        val productId1 = ProductId()
        val product1 = Product(productId1, "Coffee", Price(6000))

        val productId2 = ProductId()
        val product2 = Product(productId2, "Chocolate", Price(900))


        val productId3 = ProductId()
        val product3 = Product(productId3, "Cookies", Price(1300))

        ProductCatalog(listOf(product1, product2, product3))[productId1].shouldBe(product1)
    }
})
