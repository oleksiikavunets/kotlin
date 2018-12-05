package abstractclasses

open abstract class BaseTemplate {

    var count = 0

    fun plus(){
        count++
        println("COUNT -> $count")
    }

    abstract fun minus()


    open fun  a(){
        println("Base.a()")
    }


}