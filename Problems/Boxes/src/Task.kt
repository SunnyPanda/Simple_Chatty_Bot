import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val box1 = IntArray(3)
    val box2 = IntArray(3)

    for (i in 0..2) {
        box1[i] = scanner.nextInt()
    }
    for (i in 0..2) {
        box2[i] = scanner.nextInt()
    }

    Arrays.sort(box1)
    Arrays.sort(box2)

    if (box1[0] == box2[0] && box1[1] == box2[1] && box1[2] == box2[2]) {
        println("Box 1 = Box 2")
    } else if (box1[0] <= box2[0] && box1[1] <= box2[1] && box1[2] <= box2[2]) {
        println("Box 1 < Box 2")
    } else if (box1[0] >= box2[0] && box1[1] >= box2[1] && box1[2] >= box2[2]) {
        println("Box 1 > Box 2")
    } else {
        println("Incomparable")
    }
}