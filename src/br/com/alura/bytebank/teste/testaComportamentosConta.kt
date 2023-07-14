import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaComportamntosConta() {
    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)
    val contaAlex = ContaCorente(alex, 1000, 2)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)
    val contaFran = ContaPoupanca(fran, 1001, 4)
    contaFran.deposita(300.0)

    println("Bom ver você ${contaFran.titular.nome}")
    println("Conta: ${contaFran.numero}-${contaFran.digito}")
    println("Saldo: ${contaFran.saldo}")
    println()

    println("Bom ver você ${contaAlex.titular.nome}")
    println("Conta: ${contaAlex.numero}")
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(valor = 70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(valor = 250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(valor = 100.0)
    println(contaFran.saldo)

    println("Saque em excesso na conta do Alex")
    contaAlex.saca(valor = 100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran")
    contaFran.saca(valor = 500.0)

    println("Tranferencia da conta da Fran para o alex")

    try {
        (contaFran.transfere(valor = 100.0, contaAlex, 2))
        println("tranferencia concluída")
    }catch (e: SaldoInsuficienteException){
        println("Falha na tranferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    }catch (e: FalhaAutenticacaoException){
        println("Falha na tranferência")
        println("Falha na autenticação")
        e.printStackTrace()
    }catch (e: Exception){
        println("Erro desconhecido")
        e.printStackTrace()
    }



    println(contaAlex.saldo)
    println(contaFran.saldo)
}