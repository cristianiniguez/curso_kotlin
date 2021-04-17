fun main(args: Array<String>) {
    val fruitsList: List<String> = listOf("Apple", "Pear", "Strawberry", "Peach")

    for (fruit in fruitsList) println("Today I'm going to eat a fruit called $fruit")

    fruitsList.forEach { fruit ->
        println("Today I'm going to eat a new fruit called $fruit")
    }

    val fruitsChars: List<Int> = fruitsList.map { fruit -> fruit.length }
    println(fruitsChars) // [5, 4, 10, 5]

    val filteredList = fruitsChars.filter { fruitLength -> fruitLength > 5 }
    println(filteredList) // [10]
}
