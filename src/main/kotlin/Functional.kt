fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    val apple = fruits.filter { it.name == "사과" }
    val apple2 = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }
    val applePrice = fruits.filter { it.name == "사과" }
        .map { it.price }
    println(applePrice)
    
}