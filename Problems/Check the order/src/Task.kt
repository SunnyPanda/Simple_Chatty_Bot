import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var prev = scanner.nextInt()
    var result = "YES"
    repeat(n - 1) {
        val num = scanner.nextInt()
        if (num > prev) {
            prev = num
        } else {
            result = "NO"
        }
    }
    println(result)
}