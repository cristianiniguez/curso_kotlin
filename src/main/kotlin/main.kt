fun main(args: Array<String>) {
    var counter = 10

    while (counter > 0) {
        println("El valor del contador es $counter")
        counter--
    }

    do {
        println("Generando numero aleatorio ...")
        val randomNumber = (0..100).random()
        println("El número generado es $randomNumber")
    } while (randomNumber > 50)
}
