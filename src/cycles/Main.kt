package cycles

fun main(args: Array<String>) {
    var index: Int = 0

    while (index < 10) {
        println("YO:) $index")
        index++
    }

    do {
        println("YO:) $index")
        index--
    } while (index > 0)

    var nums = 1..10

    for (value in nums){
        println("YO:) $value")
    }

    for (value in nums step 2){
        println("YO:) $value")

    }

    for (value in 10 downTo 1 step 3) {
        println("YO:) $value")

    }

}

