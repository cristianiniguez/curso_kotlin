fun main(args: Array<String>) {
    val colorName = "Carmesí"

    when (colorName) {
        "Amarillo" -> println("El amarillo es el color de la alegría")
        "Rojo", "Carmesí" -> println("Este color simboliza el calor")
        else -> println("Error, no tengo información de este color")
    }

    val code = 200

    when (code) {
        in 200..299 -> println("Todo ha ido bien")
        in 400..500 -> println("Algo ha fallado")
        else -> println("Código desconocido, algo ha fallado")
    }

    val shoesSize = 41

    val message = when (shoesSize) {
        41,43 -> "Tenemos disponible"
        42,44 -> "Casi no nos quedan"
        45 -> "Lo siento, no tenemos disponible"
        else -> "Estos zapatos solo vienen en tallas 41, 42, 43, 44 y 45"
    }

    println(message)
}
