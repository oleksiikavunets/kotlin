package enums

fun main(args: Array<String>) {

    var msg : Colors = Colors.GREEN
    var msg1: String = Colors.RED.name
    println(Colors.GREEN.name)
    println(Colors.RED.colorHex)
    println(Colors.BLACK.opacity)
    Colors.BLACK.some()

    var N = 1
    var result = when (N){
        1 -> "ONE"
        2 -> "TWO"
        3 -> "THREE"
        4 -> "FOUR"
        5 -> "FIVE"
        6 -> "SIX"
        else -> "None"
    }

    println(result)

}