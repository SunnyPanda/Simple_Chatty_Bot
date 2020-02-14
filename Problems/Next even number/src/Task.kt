import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    //val nextNumber = number + 1
    //val nextEvenNumber = nextNumber + nextNumber % 2
    val nextEvenNumber = number - number % 2 + 2

    println(nextEvenNumber)
}