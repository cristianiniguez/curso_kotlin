fun main(args: Array<String>) {
    printName(firstName = "Cristian", lastName = "Iñiguez") // My name is Cristian  Iñiguez
}

fun printName(firstName: String, secondName: String = "", lastName: String) {
    println("My full name is $firstName $secondName $lastName")
}