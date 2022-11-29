package inheritance

class Cat(
    kind: String
) : Animal(kind, 4) {

    override fun move() {
        println("고양이")
    }

}