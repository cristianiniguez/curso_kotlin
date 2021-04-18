fun main(args: Array<String>) {
    val randomPhrase = "En Platzi nunca paramos de aprender".randomCase()
    printPhrase(randomPhrase)
}

fun printPhrase(phrase: String): Unit {
    println("Tu frase es: $phrase")
}

fun String.randomCase(): String {
    val randomNumber = 0..99
    val randomResult = randomNumber.random()
    return if (randomResult.rem(2) == 0) {
        this.toUpperCase()
    } else {
        this.toLowerCase()
    }
}