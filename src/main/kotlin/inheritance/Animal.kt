package inheritance

abstract class Animal(
    protected val kind: String,
    protected open val legs: Int
) {

    abstract fun move()

}