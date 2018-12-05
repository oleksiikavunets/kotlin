package pojo

fun main(args: Array<String>) {
    val person1 = Person("Alex", 31)
    val person2 = person1.copy(name = "Bob", age = 1)

    person1.age = 12

    val (name, age) = person1

    println(person1)
    println(person2)
    println(name)
    println(age)
}