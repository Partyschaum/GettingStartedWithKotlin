package usecase

interface UseCase<R> {
    fun invoke(request: R)
}
