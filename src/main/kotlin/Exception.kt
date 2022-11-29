import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import kotlin.NumberFormatException

fun main() {

    validateNumber("123")
    readFile()

}

fun validateNumber(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 문자열 ${str}은 숫자가 아닙니다!")
    }
}

fun validateNumber2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile() {
    val currentFile = File("src/main/kotlin")
    val file = File(currentFile.absolutePath + "/hello.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

fun readFile(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}