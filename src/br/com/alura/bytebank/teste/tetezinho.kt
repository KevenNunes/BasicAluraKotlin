package br.com.alura.bytebank.teste

import java.util.*
import kotlin.math.pow


fun testezinho() {
    val a = readLine()!!.toInt() // Lê o primeiro valor inteiro
    val b = readLine()!!.toInt() // Lê o segundo valor inteiro

    val soma = a + b // Calcula a soma dos valores

    println("SOMA = $soma")
}

fun media() {

    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()

    val media = ((a * 3.5) + (b * 7.5)) / 11

    println("MEDIA = %.5f".format(media)) // %.5f (metodo usado para determinar casas após a virgula )
}

fun calculoSalario() {
    val numeroFuncionario = readLine()!!.toInt()
    val horasTrabalhadas = readLine()!!.toInt()
    val valorHora = readLine()!!.toDouble()

    val salario = horasTrabalhadas * valorHora

    println("NUMBER = $numeroFuncionario")
    println("SALARY = ${"%.2f".format(salario)}")

}

fun calculoPcas() {

    val input = Scanner(System.`in`)

    // Lê as informações da primeira peça
    val codigoPeca1 = input.nextInt()
    val numeroPecas1 = input.nextInt()
    val valorUnitarioPeca1 = input.nextDouble()

    // Lê as informações da segunda peça
    val codigoPeca2 = input.nextInt()
    val numeroPecas2 = input.nextInt()
    val valorUnitarioPeca2 = input.nextDouble()

    // Calcula o valor total a ser pago
    val valorTotal = numeroPecas1 * valorUnitarioPeca1 + numeroPecas2 * valorUnitarioPeca2

    // Imprime o resultado
    println("VALOR A PAGAR: R$ %.2f".format(valorTotal))

}

fun calculoCirculo() {

    val raio = readLine()!!.toDouble()
    val pi = 3.14159

    val calculo = (4 / 3.0) * pi * raio.pow(3)

    println("VOLUME = %.3f".format(calculo))
}

fun valorMaior() {

    val valores = readLine()!!.split(" ").map { it.toInt() }
    val a = valores[0]
    val b = valores[1]
    val c = valores[2]

    val maior = if (a > b && a > c) {
        a
    } else if (b > c) {
        b
    } else {
        c
    }

    println("$maior eh o maior")

}

fun quatidadeLitrosGastos() {
    val scanner = Scanner(System.`in`)
    val tempoGasto = readLine()!!.toInt()
    val velocidadeMedia = scanner.nextInt()

    val litrosNecessarios = tempoGasto * velocidadeMedia / 12.0

    println("%.3f".format(litrosNecessarios))
}

fun cedulas() {

    val scanner = Scanner(System.`in`)
    val valor = scanner.nextInt()

    val notas = arrayOf(100, 50, 20, 10, 5, 2, 1)
    var resto = valor

    println(valor)
    for (nota in notas) {
        val quantidadeNotas = resto / nota
        resto %= nota
        println("$quantidadeNotas nota(s) de R$$nota,00")
    }
}
