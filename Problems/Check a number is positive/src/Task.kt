import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val positive = if (number > 0) "YES" else "NO"

    println(positive)
}