package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome="Joao",salario=10000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome="Pedro",salario=2400.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome="Maria",salario=4000.0, tipoContratacao = "CLT")

    println("###### LIST #######")
    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach { println(it) }

    println(DIVISOR)
    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println(DIVISOR)
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("###### SET #######")
    val funcionariosSet = mutableSetOf(joao)
    println(DIVISOR)
    //funcionariosSet.forEach { println(it) }

    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println(DIVISOR)
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }


}