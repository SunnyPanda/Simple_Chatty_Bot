import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    //val result = number < 10 && number > 0
    val result = number in 1..9
    println(result)
}
