import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    val result = if (n in -14..12 || n in 15..16 || n >= 19) "True" else "False"

    println(result)
}