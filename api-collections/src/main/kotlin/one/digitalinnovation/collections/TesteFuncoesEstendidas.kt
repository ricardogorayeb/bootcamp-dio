package one.digitalinnovation.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1550".toBigDecimal(),
        "4000".toBigDecimal()
    )

    salarios.forEach { println(it) }

    println(DIVISOR)
    println(salarios.somatoria())

    println(DIVISOR)
    println(salarios.media())
}