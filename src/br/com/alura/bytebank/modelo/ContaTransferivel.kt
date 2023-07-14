package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int,
    digito: Int
) : Conta(
    titular = titular,
    numero = numero,
    digito = digito
)
