import br.com.alura.bytebank.modelo.*

fun TestaContasDiferentes() {
    val contaCorente = ContaCorente(
        titular = Cliente(
            nome = "Alex",
            cpf = "",
            senha = 1,
            endereco = Endereco(
                logradouro = "Rua Vergueiro",
            )
        ),
        numero = 1000,
        digito = 3
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
        numero = 1001,
        digito = 2
    )
    val contaSalario = ContaSalario(
        titular = Cliente(
            nome = "Gui",
            cpf = "",
            senha = 5
        ),
        numero = 1002,
        digito = 1
    )
    contaCorente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)
    println("saldo Conta Corente ${contaCorente.saldo}")
    println("Saldo Conta Poupança ${contaPoupanca.saldo}")
    println("Saldo Conta Salario ${contaSalario.saldo}")
    println()

    contaPoupanca.saca(100.0)
    contaCorente.saca(100.0)
    contaSalario.saca(100.0)
    println("Saldo após saque Conta Corente ${contaCorente.saldo}")
    println("Saldo após saque Conta Poupança ${contaPoupanca.saldo}")
    println("Saldo após saque Conta Salario ${contaSalario.saldo}")
    println()

    contaCorente.transfere(100.0, contaPoupanca, 1)
    println("Saldo Conta Corente após trnaferencia ${contaCorente.saldo}")
    println("Saldo Conta Poupança após receber tranferencia ${contaPoupanca.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaCorente, 2)
    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorente.saldo}")
    println()

    contaCorente.transfere(100.0, contaSalario, 1)
    println("saldo corrente após transferir para salário: ${contaCorente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
    println()

    contaPoupanca.transfere(200.0, contaSalario, 2)
    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")
    println()

}


