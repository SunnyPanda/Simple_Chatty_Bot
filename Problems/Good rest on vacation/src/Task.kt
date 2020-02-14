import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val days = scanner.nextInt()
    val foodPerDay = scanner.nextInt()
    val oneWayFlight = scanner.nextInt()
    val nightInHotel = scanner.nextInt()

    val total = foodPerDay * days + oneWayFlight * 2 + (days - 1) * nightInHotel
    println(total)
}