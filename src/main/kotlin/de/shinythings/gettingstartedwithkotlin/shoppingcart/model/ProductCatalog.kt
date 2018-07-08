package de.shinythings.gettingstartedwithkotlin.shoppingcart.model

class ProductCatalog(private val products: List<Product>) {
    operator fun get(productId: ProductId): Product {
        return products.find { it.id == productId } ?: throw ProductNotFoundException("ProductId $productId not found!")
    }
}

class ProductNotFoundException(override val message: String?) : RuntimeException()
