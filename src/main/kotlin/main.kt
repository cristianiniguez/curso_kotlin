// Declaramos las variables de nuestras respuestas
const val RESPUESTA_AFIRMATIVA = "✔"
const val RESPUESTA_NEGATIVA = "✘"
const val RESPUESTA_DUDOSA = "?"

// Unimos las respuestas con los valores
val respuestas = mapOf(
    "Si" to RESPUESTA_AFIRMATIVA,
    "Es cierto" to RESPUESTA_AFIRMATIVA,
    "Totalmente" to RESPUESTA_AFIRMATIVA,
    "Sin duda" to RESPUESTA_AFIRMATIVA,
    "Pregunta en otro momento" to RESPUESTA_DUDOSA,
    "No puedo decirte en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA,
)

fun main(args: Array<String>) {
    println("Hola, soy tu Bola 8 magica creada en Kotlin")
    println("¿Cual de estas opciones deseas realizar?")
    println("1. Realizar una pregunta")
    println("2. Revisar todas las respuestas")
    println("3. Salir")

    val valorIngresado = readLine()
    when (valorIngresado) {
        "1" -> realizarPregunta()
        "2" -> mostrarRespuestas()
        "3" -> salir()
        else -> mostrarError()
    }
}

fun mostrarError() {
    println("Respuesta incorrecta. Adiós")
}

fun salir() {
    println("Hasta luego")
}

fun mostrarRespuestas() {
    println("Selecciona una opcion:")
    println("1. Revisar todas las respuestas")
    println("2. Revisar solo las respuestas afirmativas")
    println("3. Revisar solo las respuestas dudosas")
    println("4. Revisar solo las respuestas negativas")

    val opcionIngresada = readLine()
    when (opcionIngresada) {
        "1" -> mostrarRespuestasPorTipo()
        "2" -> mostrarRespuestasPorTipo(RESPUESTA_AFIRMATIVA)
        "3" -> mostrarRespuestasPorTipo(RESPUESTA_DUDOSA)
        "4" -> mostrarRespuestasPorTipo(RESPUESTA_NEGATIVA)
        else -> mostrarError()
    }

}

fun mostrarRespuestasPorTipo(tipoDeRespuesta: String = "TODAS") {
    when (tipoDeRespuesta) {
        "TODAS" -> respuestas.keys.forEach { respuesta -> println(respuesta) }

        RESPUESTA_AFIRMATIVA -> respuestas.filterValues { valores -> valores == RESPUESTA_AFIRMATIVA }
            .also { respuestasPositivas -> println(respuestasPositivas.keys) }

        RESPUESTA_NEGATIVA -> respuestas.filterValues { valores -> valores == RESPUESTA_NEGATIVA }
            .also { respuestasNegativas -> println(respuestasNegativas.keys) }

        RESPUESTA_DUDOSA -> respuestas.filterValues { valores -> valores == RESPUESTA_DUDOSA }
            .also { respuestasDudosas -> println(respuestasDudosas.keys) }
    }
}

fun realizarPregunta() {
    println("¿Que pregunta deseas realizar?")
    readLine()
    println("Asi que esa era tu pregunta... La respuesta a eso es:")
    val respuestaGenerada = respuestas.keys.random()
    println(respuestaGenerada)
}
