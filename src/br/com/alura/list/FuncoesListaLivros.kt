package br.com.alura.list

fun List<Livro?>.imprimeComMarcadores() {
    val tesxtoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("### Lista de Livros ### \n$tesxtoFormatado")
}