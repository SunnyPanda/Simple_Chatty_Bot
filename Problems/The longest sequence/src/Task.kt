import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var prev = scanner.nextInt()
    var seq = 1
    var maxSeq = 1
    repeat(n - 1) {
        val num = scanner.nextInt()
        if (num >= prev) {
            seq++
        } else {
            if (seq > maxSeq) maxSeq = seq
            seq = 1
        }
        if (seq > maxSeq) maxSeq = seq
        prev = num
    }
    println(maxSeq)
}