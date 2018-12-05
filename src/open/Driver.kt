package open

class Driver(name: String) : Person(name) {

    override val age: Int = 32
    override fun getAddress(): String{
        return "Driver`s address"
    }

    override fun toString(): String {
        return "Driver(name = '$name', age = $age)"
    }
}