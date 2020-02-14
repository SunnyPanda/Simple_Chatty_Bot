import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val firstDigit = number / 100
    val secondDigit = (number % 100) / 10
    val thirdDigit = (number % 100) % 10
    println("" + thirdDigit + secondDigit + firstDigit)
}