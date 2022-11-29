fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {

    //static이 없기에 그냥 클래스 만드는 것처럼 사용
    class LivingRoom(
        private val area: Double
    )

    //외부 참조하려면 inner 붙여서 사용
    inner class BathRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House.address
    }
}