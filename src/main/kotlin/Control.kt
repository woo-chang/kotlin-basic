import java.lang.IllegalArgumentException

fun main() {

    validateNumber(50);
    
}

fun validateNumber(number: Int) {
    if (number > 100) {
        throw IllegalArgumentException("${number}은 100보다 작을 수 없습니다!")
    }
}

fun validateCase(number: Int): String {
    return if (number > 80) {
        "A";
    } else if (number > 60) {
        "B";
    } else {
        "F";
    }
}

fun validateRange(number: Int): String {
    return if (number in 80..100) {
        "A";
    } else {
        "B";
    }
}

fun validateSwitch(number: Int): String {
    return when (number) {
        in 91..100 -> "A"
        90 -> "B"
        in 80..89 -> "C"
        60, 70, 75 -> "D"
        else -> "F"
    }
}