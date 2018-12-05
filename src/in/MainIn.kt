package `in`

fun main(args: Array<String>) {

    val nums = 1..10
    val characters = 'a'..'z'


    val val1 = 3

    val val2 = 14

    isInNums(val1, nums)

    isInNums(val2, nums)

    println(isChar('/', characters))
    println(isChar('i', characters))
}

fun isInNums(num: Int, nums: IntRange) {
    for (n in nums) {
        if (num == n) {
            println(num)
            break
        }
    }
}

fun isChar(char: Char, characters: CharRange) = char in characters

