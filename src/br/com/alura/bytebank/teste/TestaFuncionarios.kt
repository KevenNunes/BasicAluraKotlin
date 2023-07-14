package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.*

fun testaFunconarios() {
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Bonificação: ${alex.bonificacao}")
    println()

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: ${fran.salario}")
    println("Bonificação: ${fran.bonificacao}")

    if (fran.autentica(senha = 1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println()

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 3000.0,
        senha = 4321,
        plr = 200.0
    )

    println("nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao}")
    println("Participação de lucro: ${gui.plr}")

    if (gui.autentica(senha = 1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    val maria: Funcionario = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 4000.0
    )

    val calcladora = CalculadoraBonificacao()
    calcladora.registra(alex)
    calcladora.registra(fran)
    calcladora.registra(gui)
    calcladora.registra(maria)

    println("total de bonificação: ${calcladora.total} ")
}