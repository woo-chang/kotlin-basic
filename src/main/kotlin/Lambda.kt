fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000),

    )
    //익명 함수이기에 함수 이름이 없다.
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과";
    }

    //함수의 타입을 표기할 수도 있다.
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    //호출하는 방법에는 2가지가 존재
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    //익명 함수가 매개변수 마지막에 존재할 때는 밖으로 뺄 수 있다.
    //익명 함수 매개변수가 1개인 경우 it으로 대체 가능
    filterFruits(fruits) { it.name == "사과" }

}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

class Fruit(
    val name: String,
    val price: Int
)