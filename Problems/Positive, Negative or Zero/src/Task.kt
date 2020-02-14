import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val num = scanner.nextInt()
    val res = when {
        num < 0 -> "negative"
        num > 0 -> "positive"
        else -> "zero"
    }
    println(res)
}