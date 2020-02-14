import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    val result = (first >= second && first <= third) || (first in third..second)

    println(result)
}