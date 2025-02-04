import java.util.Scanner

// write your function here

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val letter = scanner.next()[0]

    println(isVowel(letter))
}

fun isVowel(letter: Char): Boolean {
    return when (letter) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true
        else -> false
    }
}