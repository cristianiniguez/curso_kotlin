fun main(args: Array<String>) {
    val initialValueLength = superFunction(initialValue = "Hello") { value -> value.length }
    print(initialValueLength) // 5

    val lambda: () -> String = functionInception("Felix")
    val lambdaValue: String = lambda()
    println(lambdaValue) // Hola desde la lambda Felix
}

fun superFunction(initialValue: String, block: (String) -> Int): Int {
    return block(initialValue)
}

fun functionInception(name: String): () -> String {
    return { "Hola desde la lambda $name" }
}
