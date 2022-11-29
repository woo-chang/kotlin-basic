class Store(
    internal val name: String,
    private var address: String,
    _price: Int
) {
    //getter, setter 중 setter 가시성만 변경하고 싶을 때
    var price = _price
        private set
}