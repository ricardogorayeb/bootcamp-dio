package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome="Joao",salario=10000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome="Pedro",salario=2400.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome="Maria",salario=4000.0, tipoContratacao = "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println(DIVISOR)
    repositorio.findAll().forEach { println(it) }

    println(DIVISOR)
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}