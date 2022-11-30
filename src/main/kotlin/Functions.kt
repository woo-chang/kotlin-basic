fun main() {

    val str = "hello"
    println(str.lastChar())
    println(1 add 3)

}

//String 클래스의 확장 함수
fun String.lastChar(): Char {
    return this[this.length-1]
}

//중위 함수
infix fun Int.add(other: Int): Int {
    return this + other
}

//인라인 함수
//성능에 주의해서 사용
inline fun write() {
    println("hello")
}