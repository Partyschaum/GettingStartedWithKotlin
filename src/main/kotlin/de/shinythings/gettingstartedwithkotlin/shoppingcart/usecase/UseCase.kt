package de.shinythings.gettingstartedwithkotlin.shoppingcart.usecase

interface UseCase<R> {
    fun invoke(request: R)
}
