fun main() {

    val person = Person.createPerson("홍길동", 20)
    println(person.name)

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    //익명 클래스 구현
    action(object: Action {
        override fun act() {
            println("익명 클래스")
        }
    })

}

fun action(action: Action) {
    action.act()
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    companion object Factory : Action {
        //const를 붙이면 컴파일 시점이 아닌 런타임 시점에 값이 할당
        private const val MIN_AGE = 1
        fun createPerson(name: String, age: Int): Person {
            return Person(name, age)
        }

        override fun act() {
            println("인터페이스 구현")
        }
    }

}

interface Action {
    fun act()
}

//object 붙이면 싱글톤
object Singleton {
    var a: Int = 0
}