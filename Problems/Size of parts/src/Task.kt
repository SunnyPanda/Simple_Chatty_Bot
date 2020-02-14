import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var larger = 0
    var smaller = 0
    var perfect = 0

    val n = scanner.nextInt()

    repeat(n) {
        when (scanner.nextInt()) {
            1 -> larger++
            -1 -> smaller++
            else -> perfect++
        }
    }

    println("$perfect $larger $smaller")
}