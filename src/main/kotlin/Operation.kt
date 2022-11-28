fun main() {

    val school1: School = School("고등학교1");
    val school2: School = School("고등학교2");
    println(school1 > school2);

    val school3: School = school1;
    val school4: School = School("고등학교1");

    //true
    println(school1 === school3);
    //false
    println(school1 === school2);
    //false
    println(school1 == school2);
    //false
    println(school1 === school4);
    //true
    println(school1 == school4);

    val result1: Boolean = check1() && check2();
    //Lazy 연산을 수행
    val result2: Boolean = check1() || check2();

    val money1: Money = Money(1000);
    val money2: Money = Money(2000);
    //plus 연산을 직접 구현 가능
    val money3: Money = money1 + money2;
    println(money3.money);

}

fun check1(): Boolean {
    println("check1");
    return true;
}

fun check2(): Boolean {
    println("check2");
    return false;
}

class Money(val money: Int) {

    operator fun plus(other: Money): Money {
        return Money(money + other.money);
    }
}