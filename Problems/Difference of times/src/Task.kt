import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val hours1 = scanner.nextInt()
    val minutes1 = scanner.nextInt()
    val seconds1 = scanner.nextInt()

    val hours2 = scanner.nextInt()
    val minutes2 = scanner.nextInt()
    val seconds2 = scanner.nextInt()

    val timeInSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1
    val timeInSeconds2 = hours2 * 3600 + minutes2 * 60 +seconds2

    println(timeInSeconds2 - timeInSeconds1)
}