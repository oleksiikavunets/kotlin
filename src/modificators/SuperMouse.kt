package modificators

class SuperMouse: Mouse() {

    fun funB(){
        println("Super text")
        funA()
    }

    internal fun funC(){
        println("Super text")
        funA()
    }
}