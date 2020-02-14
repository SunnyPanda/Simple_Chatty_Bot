import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val res = if (number % 2 == 0) "EVEN" else "ODD"
    println(res)
}