package one.digitalinnovation.collections

fun main() {

    val values = IntArray(5)

    values[0] = 1300
    values[1] = 228
    values[2] = 131
    values[3] = 44
    values[4] = 456

    for (valor in values) {
        println(valor)
    }

    println("##################################")
    values.forEach {
        println(it)
    }

    println("##################################")
    values.forEach { valor ->
        println(valor)
    }
    println("##################################")
    for (index in values.indices) {
        println(values[index])
    }

    println("##################################")
    values.sort() //ordenacao
    for (valor in values) {
        println(valor)
    }

}