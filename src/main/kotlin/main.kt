fun main(args: Array<String>) {
    val myLambda: (String) -> Int = { value -> value.length }
    val lambdaExecuted: Int = myLambda("Hello World")
    println(lambdaExecuted) // 11

    val greetings = listOf("Hello", "Hola", "Ciao")
    val greetingsLengths = greetings.map(myLambda)
    println(greetingsLengths) // [5, 4, 4]
}
