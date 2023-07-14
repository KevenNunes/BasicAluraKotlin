package br.com.alura.bytebank.exceptions

class SaldoInsuficienteException(mensagem: String = "O saldo é insufisiente" ) : Exception(mensagem)