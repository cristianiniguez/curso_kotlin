fun main(args: Array<String>) {
    val mobiles = mutableListOf("Pixel 1", "Pixel 2", "Huawei 9", "Xiaomi A3")
        .run {
            removeIf { mobile -> mobile.contains("Pixel") }
            this
        }

    print(mobiles) // [Huawei 9, Xiaomi A3]
}
