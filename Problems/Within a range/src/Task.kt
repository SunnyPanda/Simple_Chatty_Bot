import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val r1 = scanner.nextInt()
    val r2 = scanner.nextInt()
    val r3 = scanner.nextInt()
    val r4 = scanner.nextInt()
    val num = scanner.nextInt()

    val res = if (num in r1..r2 || num in r3..r4) "YES" else "NO"
    println(res)
}