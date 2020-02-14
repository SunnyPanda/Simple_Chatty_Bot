import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val age = scanner.nextInt()

    val res = if (age in 18..59) "YES" else "NO"

    println(res)
}