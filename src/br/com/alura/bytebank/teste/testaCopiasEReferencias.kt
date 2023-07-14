import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 3)
    val contaJoao = ContaCorente(joao, 1005, 8)
    contaJoao.titular.nome = "João"

    val maria = Cliente(nome = "Maria", cpf = "", senha = 4)
    var contaMaria = ContaPoupanca(maria, 1004, 5)
    contaMaria.titular.nome = "Maria"

    contaJoao.titular.nome = "João"
    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")
    println(contaJoao)
    println(contaMaria)
}