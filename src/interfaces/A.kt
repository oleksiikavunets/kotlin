package interfaces

class A: MyInterface {
    override fun fun1() {
        println("A.fun1()")
    }

    override fun fun2() {
        super.fun2()
    }
}