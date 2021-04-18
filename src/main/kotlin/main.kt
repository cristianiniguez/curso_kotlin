fun main(args: Array<String>) {
    val lotteryNumbers = listOf(11, 82, 22, 43, 56, 78, 66)

    val sortedNumbers = lotteryNumbers.sorted()
    println(sortedNumbers) // [11, 22, 43, 56, 66, 78, 82]

    val sortedDescNumbers = lotteryNumbers.sortedDescending()
    println(sortedDescNumbers) // [82, 78, 66, 56, 43, 22, 11]

    val sortByMultiples = lotteryNumbers.sortedBy { number -> number < 50 }
    println(sortByMultiples) // [82, 56, 78, 66, 11, 22, 43]

    val randomNumbers = lotteryNumbers.shuffled()
    println(randomNumbers) // [43, 22, 56, 78, 82, 66, 11]

    val reverseNumbers = lotteryNumbers.reversed()
    println(reverseNumbers) // [66, 78, 56, 43, 22, 82, 11]

    val numberMessages = lotteryNumbers.map { number -> "Tu numero de loteria es $number" }
    println(numberMessages) // [Tu numero de loteria es 11, ...]

    val filteredNumbers = lotteryNumbers.filter { number -> number > 50 }
    println(filteredNumbers) // [82, 56, 78, 66]

}
