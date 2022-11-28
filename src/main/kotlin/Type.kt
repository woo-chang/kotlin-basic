fun main() {

    val intNumber = 3;
    val longNumber: Long = intNumber.toLong();
    val intNumber2: Int = longNumber.toInt();

    val result1 = intNumber / intNumber;
    val result2 = intNumber / intNumber.toDouble();

    println(result1);
    println(result2);

    val target: Int? = 5;
    val targetToResult = target?.toLong() ?: 0L;

    val school: School = School("고등학교");
    classCasting(school);
    classCasting("Hello");

    classCastingWithNull(school);
    classCastingWithNull("hello");
    classCastingWithNull(null);

    println("출력 구문을 간단하게 작성, ${school.name}로 돌아갈 수 있다면?")
    //단순 변수는 중괄호 생략 가능
    println("출력 : $intNumber2")

    val str = """
        안녕하세요
          신기한 기능
    """.trimIndent()
    println(str);
    val char = str[3];
    println(char);
    
}

fun classCasting(obj: Any) {
    if (obj is School) {
        //아래 코드 생략해서 코틀린 컴파일러가 자동으로 해당 타입으로 간주
        //if문 컨텍스트를 자동으로 분석하기에
        val school: School = obj as School;
        println(school.name);
    }
    if (obj !is School) {
        println("Not");
    }
}

fun classCastingWithNull(obj: Any?) {
    //type가 동일한 경우 타입 캐스팅
    //null이거나 type가 다른 경우 null
    val school = obj as? School;
    println(school?.name)
}