fun main(args: Array<String>) {
    val mobiles = mutableListOf("Pixel 1", "Pixel 2", "Huawei 9", "Xiaomi A3")
        .also {
            list -> println("Valor original: $list") // Valor original: [Pixel 1, Pixel 2, Huawei 9, Xiaomi A3]
        }.asReversed()

    println(mobiles) // [Xiaomi A3, Huawei 9, Pixel 2, Pixel 1]


}
