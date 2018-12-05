package enums

enum class Colors(
        val colorHex: String,
        val opacity: Double? = 1.0
) {

    WHITE("#FFFFF"),
    BLACK("#00000"),
    RED("#EEEEE", 0.5),
    GREEN("#22222");


    fun some(){
        println("Some method")
    }
}