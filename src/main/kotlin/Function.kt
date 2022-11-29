fun main() {

    println(max(3, 5))
    repeat("hello")
    repeat("hi", newLine = false)

    val array = arrayOf("1", "2", "3")
    variables(*array)

}

//타입을 추론할 수 있기 때문에 반환 타입 생략 가능
fun max(a: Int, b: Int) = if (a > b) a else b

fun repeat(str: String, num: Int = 3, newLine: Boolean = true) {
    for (i in 1..num) {
        if (newLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun variables(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}