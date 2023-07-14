package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.list.listaLivrosComNulos

fun main() {
    testaRun()
    println(listaLivrosComNulos)
}

fun testaRun() {
    val taxaAnual = 0.05
    val taxaMensal = taxaAnual / 12
    println("taxa mensal $taxaMensal")

    val contaPoupanca = ContaPoupanca(Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1234), 1000, 0)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendiento Mensal $rendimentoMensal")
    }

    val rendimentoanual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) { indice ->
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Simulação Rendimento Anual $rendimentoanual")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua Vergueiro"
        numero = 3185
        bairo = "Vila Mariana"
        cidade = "São Paulo"
        estado = "SP"
        cep = "0310-063"
        complemento = "Aparetamento"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}




