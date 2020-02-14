import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var min = scanner.nextInt()

    repeat(n - 1) {
        val num = scanner.nextInt()
        if (num < min) {
            min = num
        }
    }
    println(min)
}