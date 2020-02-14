import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var max = 1
    var secondMax = 1
    for (i in 1..n) {
        val num = scanner.nextInt()
        if (num > max) {
            secondMax = max
            max = num
        } else if (num > secondMax) {
            secondMax = num
        }
    }

    println(max * secondMax)
}