import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val first = scanner.nextInt()
    val second = scanner.nextInt()
    val third = scanner.nextInt()

    val result = (first + second == 20) || (second + third == 20) || (first + third == 20)

    println(result)
}