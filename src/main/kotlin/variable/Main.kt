package variable

fun main() {

    var changeableNumber = 1; //변경 가능
    val notChangeableNumber = 2; //변경 불가능

    //primitive type 알아서 처리
    var long: Long = 1L; //접미사 L
    var float: Float = 1f; //접미사 f, F
    var double: Double = 1.0; //접미사 x

    //null이 들어갈 수 있는지 명시적으로 작성
    var nullable: Long? = null;

    var city: City = City(1, "부산");

    //자동으로 getter 생성
    println(city.street);
    println(city.name);

    //var 변수만 setter 존재
    city.name = "서울";

    println(city.name);

}

class City {
    //내부 필드는 private
    val street: Int;
    var name: String;

    constructor(street: Int, name: String) {
        this.street = street;
        this.name = name;
    }

}