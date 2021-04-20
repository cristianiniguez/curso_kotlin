fun main(args: Array<String>) {
    var name: String? = null
    name?.let { value -> println("El nombre no es nulo. Es $value") }

    name = "Cristian"
    name?.let { value -> println("El nombre no es nulo. Es $value") }
}
