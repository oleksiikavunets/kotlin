package open

fun main(args: Array<String>) {
    var person = Person("Alex")
    var driver = Driver("Bob")

    println(person)
    println(driver)

    println(person.getAddress())
    println(driver.getAddress())
}