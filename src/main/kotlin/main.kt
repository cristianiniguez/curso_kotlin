fun main(args: Array<String>) {
    val namesList = listOf("Juan", "Enrique", "Camila")
    println(namesList) // [Juan, Enrique, Camila]

    val voidList = mutableListOf<String>()
    println(voidList) // []

    voidList.add("Juan")
    println(voidList) // [Juan]

    val valueUsingGet = voidList.get(0)
    println(valueUsingGet) // Juan

    val valueUsingOperator = voidList[0]
    println(valueUsingOperator) // Juan

    val firstValue: String? = namesList.firstOrNull()
    println(firstValue) // Juan

    voidList.removeAt(0)
    println(voidList) // []

    voidList.add("Enrique")
    voidList.add("Luis")

    println(voidList) // [Enrique, Luis]
    voidList.removeIf { chars -> chars.length > 4 }
    println(voidList) // [Luis]

    val myArray = arrayOf(1, 2, 3)
    println(myArray) // [Ljava.lang.Integer;@483bf400
    println(myArray.toList()) // [1, 2, 3]
}
