package br.com.alura.bytebank.exceptions

class FalhaAutenticacaoException(
    mensagem: String = "Falha na autenticação",
) : Exception(mensagem)