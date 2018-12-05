package `when`

import enums.Colors
import enums.Colors.*

fun main(args: Array<String>) {

    println(getFavoriteColor(WHITE))
    getFavoriteColor1()

}


fun getFavoriteColor(color: Colors) = when (color) {
    BLACK, WHITE -> "black or white"
    RED, GREEN -> "red or green"

    else -> "no color"
}

fun getFavoriteColor1() {
    when (setOf(WHITE, BLACK)) {
        setOf(BLACK, WHITE) -> println("black or white")
        setOf(RED, GREEN) -> println("red or green")
    }
}

fun getFavoriteColor2() {
    var a = 2
    var b = 4
    when {
        (a > b) -> println("a > b")
        (a < b) -> println("a < b")
        (a == b) -> println("a == b")
        else -> println("else")
    }
}
