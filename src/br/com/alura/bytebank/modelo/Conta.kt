package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exceptions.FalhaAutenticacaoException
import br.com.alura.bytebank.exceptions.SaldoInsuficienteException


abstract class Conta(
    var titular: Cliente,
    val numero: Int,
    var digito: Int,
) : Autenticavel {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
    }

//        constructor(titular: String, numero:Int, digito: Int) {
//            this.titular = titular
//            this.numero = numero
//            this.digito = digito
//        }


    override fun autentica(senha: Int): Boolean {
        return titular.autentica(senha)
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        if (saldo < valor) {
            throw SaldoInsuficienteException(
                mensagem = "O saldo é insuficienfe, saldo atual: $saldo, valor a ser subtraido $valor"
            )
        }

       if (!autentica(senha)) {
           throw FalhaAutenticacaoException()
       }

        saldo -= valor
        destino.deposita(valor)
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if(valor > 0){
//            saldo = valor
//        }
//    }
}

class ContaCorente(
    titular: Cliente,
    numero: Int,
    digito: Int,
) : ContaTransferivel(
    titular = titular,
    numero = numero,
    digito = digito
) {


    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    numero: Int,
    digito: Int,
) : ContaTransferivel(
    titular = titular,
    numero = numero,
    digito = digito
) {


    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        }
    }
}

class ContaSalario(
    titular: Cliente,
    numero: Int,
    digito: Int,
) : Conta(
    titular = titular,
    numero = numero,
    digito = digito
) {


    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        }
    }
}