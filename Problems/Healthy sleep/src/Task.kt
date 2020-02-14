import java.util.*
import kotlin.coroutines.suspendCoroutine

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val h = scanner.nextInt()

    val result = when {
        h < a -> "Deficiency"
        h > b -> "Excess"
        else -> "Normal"
    }

    println(result)
}