class Car(private var weigt: Double, private var size: Int) {

    var isNew: Boolean = false

        get() {
            return weigt > size
        }

        set(value) {
            if (value){
                println("yes")
            }
            field = value
        }

}