package abstractclasses

class ATemplate : BaseTemplate() {

    override fun a(){
        println("A.a()")
    }

    override fun minus(){
        count--
        println("COUNT -> $count")
    }
}