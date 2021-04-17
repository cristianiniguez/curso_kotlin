const val PI = 3.1416

fun main(args: Array<String>) {
    println("Hello World!")
    var money = 10
    println(money) // 10
    money = 5
    println(money) // 5

    val name = "Cristian"
    println(name) // Cristian

    println(PI) // 3.1416

    val boolean = true
    val longNumber = 3L
    val doubleNumber = 2.7282
    val floatNumber = 1.1f

    val first = 20
    val second = 10

    val third = first - second
    println(third) // 10

    val lastName = "Iñiguez"
    val firstName = "Cristian"
    val fullName = "Mi nombre es $firstName $lastName"
    println(fullName) // Mi nombre es Cristian Iñiguez
}
