import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    val result = if (b + c > a && a + c > b && a + b > c) "YES" else "NO"
    println(result)
}