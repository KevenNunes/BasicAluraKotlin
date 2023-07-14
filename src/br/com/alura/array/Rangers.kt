package br.com.alura.array

fun main() {
    // Mostra os numeros de 1 á 10
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s ")
    }

    // Mostra os numeros de 0 á 100 pulando de dois em dois
    println()
    val numerosPares = 2..99 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    // Mostra os numeros de 100 á 0 pulando de dois em dois
    println()
    val numerosParesReverso = 100 downTo 0 step 2
    numerosParesReverso.forEach { print("$it ") }

    // Verifica se SALARIO está dentro do INTERVALO
    println()
    val intervalo = 1500.0..5000.0
    val salario = 4000.0
    if (salario in intervalo) {
        println("está dentro do intervalo")
    } else {
        println("Não está dentro de intervalo")
    }

    // Verifica se LETRA está dentro do ALFABETO, contudo, apenas letras minúsculas
    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}