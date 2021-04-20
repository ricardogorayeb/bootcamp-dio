package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }

    println("############")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    println("############")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach {
        println(salariosMaiorQue2500)
    }

    println("############")
    println(salarios.count {it in 2000.0..5000.0}) //imprime qtdade de salarios entre 2k e 5k

    println("############")
    println(salarios.find {it == 2250.0})
    println(salarios.find {it == 50.0})

    println("############")
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 1001.0})



}