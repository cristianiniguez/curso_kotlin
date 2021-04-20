fun main(args: Array<String>) {
    val colors = listOf("Blue", "Yellow", "Red")
    with(colors) {
        println("Nuestros colores son $this") // Nuestros colores son [Blue, Yellow, Red]
        println("Esta lista tiene $size color(es)") // Esta lista tiene 3 color(es)
    }
}
