fun main(args: Array<String>) {
    val superheroesAge = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    println(superheroesAge) // {Ironman=35, Spiderman=23, Capitan America=99}

    superheroesAge.put("Wolverine", 45)
    println(superheroesAge) // {Ironman=35, Spiderman=23, Capitan America=99, Wolverine=45}

    superheroesAge["Storm"] = 30
    println(superheroesAge) // {Ironman=35, Spiderman=23, Capitan America=99, Wolverine=45, Storm=30}

    val ageIronman = superheroesAge["Ironman"]
    println(ageIronman) // 35

    superheroesAge.remove("Wolverine")
    println(superheroesAge) // {Ironman=35, Spiderman=23, Capitan America=99, Storm=30}

    println(superheroesAge.keys) // [Ironman, Spiderman, Capitan America, Storm]
    println(superheroesAge.values) // [35, 23, 99, 30]
}
