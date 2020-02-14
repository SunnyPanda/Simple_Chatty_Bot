import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val begin = scanner.nextInt()
    val end = scanner.nextInt()

    for (i in begin..end) {
        println(when {
            i % 3 == 0 && i % 5 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"
            else -> i
        })
    }
}