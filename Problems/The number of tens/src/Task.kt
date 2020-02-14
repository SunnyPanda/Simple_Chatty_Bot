import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number  = scanner.nextInt()
    val tens = number % 100 / 10

    println(tens)
}