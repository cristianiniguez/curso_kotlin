fun main(args: Array<String>) {
    val mobiles = mutableListOf("Pixel 1", "Pixel 2", "Huawei 9", "Xiaomi A3")
        .apply {
            removeIf { mobile -> mobile.contains("Pixel") }
        }

    print(mobiles) // [Huawei 9, Xiaomi A3]

    val colors: MutableList<String>? = null
    colors?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es $size")
    }
}
