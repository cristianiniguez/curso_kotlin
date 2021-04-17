fun main(args: Array<String>) {
    var name: String? = null
    try {
        throw NullPointerException("Referencia nula")
    } catch (exception: NullPointerException) {
        println("Ha ocurrido un error")
    } finally {
        println("Cerrando aplicación")
    }

    val firstValue = 10
    val secondValue = 0

    val result: Int = try {
        firstValue / secondValue
    } catch (exception: Exception) {
        0
    }

    println(result) // 0
}
