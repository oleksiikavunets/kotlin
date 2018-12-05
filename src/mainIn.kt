import animals.cat.CatA
import animals.*

fun main(args: Array<String>) {
    val userJava = UserJava("user_java@email.com")
    println("Java example: ${userJava.email}")

    val userKotlin = UserKotlin("user_kotlin@mail.com")
    println("Kotlin example: ${userKotlin.email}")

    var catA = CatA()
    catA.a1()
    catA.a2()

    superMethod1()
    superMethod2()

}