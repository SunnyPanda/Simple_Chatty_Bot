import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val temp = number % 100
    val sum = number / 100 + temp / 10 + temp % 10
    println(sum)
}