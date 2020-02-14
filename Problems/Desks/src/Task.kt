import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val group1 = scanner.nextInt()
    val group2 = scanner.nextInt()
    val group3 = scanner.nextInt()

    val desks1 = group1 / 2 + group1 % 2
    val desks2 = group2 /2 + group2 % 2
    val desks3 = group3 /2 + group3 % 2

    println(desks1 + desks2 + desks3)
}