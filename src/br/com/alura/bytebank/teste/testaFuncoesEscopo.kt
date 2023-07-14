package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco


fun testaFuncoesEscopo() {
    //    val endereco = Endereco("rua vergueiro", 3185)
//    val enderecoEmMaiusculo:String = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(Endereco("casa"),
        Endereco(),
        Endereco("apartamento"))
        .filter { endereco -> endereco.complemento.isNotEmpty() }
        .let(block = ::println)
}