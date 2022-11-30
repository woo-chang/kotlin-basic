fun main() {

    val array = arrayOf(100, 200, 300)
    for (i in array.indices) {
        println(array[i])
    }
    for ((index, value) in array.withIndex()) {
        println("index: ${index}, value: ${value}")
    }
    //쉽게 배열에 값을 추가
    array.plus(400)

    val numbers = listOf(100, 200)
    //들어올 타입을 명시해주어야 한다.
    val emptyNumbers = emptyList<Int>()

    //가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)

    val set = setOf(100, 100)
    val mutableSet = setOf(100, 100)

    val map = mutableMapOf<Int, String>()
    map[1] = "hello"
    val newMap = mapOf(1 to "hello", 2 to "hi")

    for (key in newMap.keys) {
        println(newMap[key])
    }

    for ((key, value) in newMap.entries) {
        println("key: ${key}, value: ${value}")
    }

}