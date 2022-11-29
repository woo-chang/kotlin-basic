import java.lang.IllegalArgumentException

fun main() {

    val people1 = People("코틀린", 1)
    val people2 = People("자바")

}

class People(val name: String, var age: Int) {

    //커스텀 getter를 사용하기 위해 아래로
    //name을 부르는 것은 getter를 부르게 되고 무한루프가 발생하기에 field를 사용
//    val name = name
//        get() = field.uppercase()

    //이 방법을 주로 사용
    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 0보다 작거나 같을 수 없습니다.")
        }
    }

    constructor(name: String): this(name, 1)

    constructor(): this("테스트") {
        println("바디를 가질 수 있다.")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult2: Boolean
        get() = this.age >= 20;
}