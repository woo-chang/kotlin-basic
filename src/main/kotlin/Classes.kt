fun main() {

    val data = DataDto("코틀린", "부산", 100)
    println(data)
    handleColor(Color.RED)

}

//data 키워드를 붙이면 equals, hashCode, toString을 자동 생성
data class DataDto(
    val name: String,
    val address: String,
    val price: Int
)

fun handleColor(color: Color) {
    when (color) {
        Color.RED -> println(Color.RED)
        Color.BLUE -> println(Color.BLUE)
    }
}

enum class Color(
    private val color: String
) {
    RED("빨간색"),
    BLUE("파란색")
}

sealed class Car(
    val name: String,
    val window: Int
)

class SkyCar : Car("하늘차", 2)

class WindCar : Car("바람차", 4)