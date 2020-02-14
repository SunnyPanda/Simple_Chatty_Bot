import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var positive = 0
    repeat(n) {
        if (scanner.nextInt() > 0) {
            positive++
        }
    }
    println(positive)
}