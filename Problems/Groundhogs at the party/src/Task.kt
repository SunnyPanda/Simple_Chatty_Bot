import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val cups = scanner.nextInt()
    val isWeekend = scanner.nextBoolean()

    val isSuccessful = (cups in 10..20 && !isWeekend) || (cups in 15..25 && isWeekend)

    println(isSuccessful)
}