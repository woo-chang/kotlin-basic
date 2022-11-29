fun main() {

    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    println("==========")

    for (i in 1..5) {
        println(i)
    }

    println("==========")

    for (i in 5 downTo 1) {
        println(i)
    }

    println("==========")

    for (i in 1..5 step 2) {
        println(i)
    }
}