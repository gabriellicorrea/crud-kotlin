package br.com.gabi.livro

class DetalhesDoLivroResponse(livro: Livro) {
    val nome = livro.nome
    val autor = livro.autor
    var descricao = livro.descricao
}