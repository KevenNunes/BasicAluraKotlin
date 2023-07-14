package br.com.alura.array

fun main() {

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
//    a utilização do do for abaixo é mais indicada
//    var indice = 0
//    for (salario in salarios) {
//        salarios[0] = salario * aumento
//        indice++
//    }
//    println(salarios.contentToString())

    for (indice in salarios.indices) {
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed {i, salario ->
       salarios[i] = salario * aumento
    }

    println(salarios. contentToString())


}

