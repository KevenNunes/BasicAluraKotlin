package br.com.alura.array

fun main() {
    // trás o maior numero no array
    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.maxOrNull()
    println("Maior idade: $maiorIdade")

    // trás o menos numero no array
    val menorIdade = idades.minOrNull()
    println("Menor Idade: $menorIdade")

    // trás a média dos valor no array
    val media: Double = idades.average()
    println("Média das Idades: $media")

    // Verifica se TODOS os numeros no array são maiores de 18, se sim trás true se não false
    val todosMaiores = idades.all { it >= 18 }
    println("Todos maiores? $todosMaiores")

    // verifica se tem algum numero maior de 18, se sim trás true se não trás false
    val existeMaior= idades.any {it >= 18}
    println("Existe maior de idade? $existeMaior")

    // trás os numeros que são maiores de 18
    val maiores = idades.filter { it >= 18 }
    println("Maiores de 18: $maiores")

    // trás os numeors menores de 18
    val menores = idades.filter { it <= 17 }
    println("meores de 18: $menores")

    // faz uma busca do numero desejado dentro do array
    val busca = idades.find { it == 18 }
    println("Busca idade: $busca")
}