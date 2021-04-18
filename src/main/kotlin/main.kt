fun main(args: Array<String>) {
    val vowels = setOf("a", "e", "i", "o", "u", "a", "e", "i", "o", "u")
    println(vowels) // [a, e, i, o, u]

    val favoriteNumbers = mutableSetOf(1, 2, 3, 4)
    println(favoriteNumbers) // [1, 2, 3, 4]

    favoriteNumbers.add(5)
    println(favoriteNumbers) // [1, 2, 3, 4, 5]

    favoriteNumbers.add(5)
    println(favoriteNumbers) // [1, 2, 3, 4, 5]

    favoriteNumbers.remove(5)
    println(favoriteNumbers) // [1, 2, 3, 4]

    val setValue: Int? = favoriteNumbers.firstOrNull { number -> number > 2 }
    println(setValue) // 3

}
