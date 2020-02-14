import java.util.*

fun divide(num1: Long, num2: Long): Double = num1.toDouble() / num2

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLong()
    val b = scanner.nextLong()
    println(divide(a, b))
}