package inheritance

class Eagle(
    kind: String
) : Animal(kind, 2), Flyable, Eatable {

    private val wing = 2

    override fun move() {
        println("독수리")
    }

    override val legs: Int
        get() = super.legs + this.wing

    override fun act() {
        super<Flyable>.act()
        super<Eatable>.act()
    }

    override val flyAbility: Int
        get() = 10
}