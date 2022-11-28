fun main() {

    val result = checkLength("hello");
    println(result);

    val target: String? = null;
    //null이 아닌 경우에만 실행
    //null인 경우 그대로 null
    println(target?.length);

    //앞의 값이 null이면 뒤의 값을 사용
    println(target?.length ?: 0)

    //자바 호환 가능
    val school: School = School("대학교");

}

fun checkLength(str: String): Boolean {
    return str.length > 3;
}

//null 허용으로 인한 오버로딩은 불가능
fun checkLengthWithNull(str: String?): Boolean {
    if (str == null) return false;
    return str.length > 3;
}

//절대 null이 아님을 보장
//null이 들어오는 경우 NPE 발생
fun checkLengthWithAbsoluteNotNull(str: String?): Boolean {
    return str!!.length > 3;
}