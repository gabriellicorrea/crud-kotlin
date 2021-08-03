package br.com.gabi.livro

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*

@Controller("/livro")
class LivroController(private val livroRepository: LivroRepository){

    @Get
    fun getLivro(): List<Any>{
        return livroRepository.findAll()
    }

    @Post
    fun addLivro(livro: Livro): HttpResponse<Any> {
        return HttpResponse.created(livroRepository.save(livro))
    }

    @Put("/{id}")
    fun atualizaLivro(@PathVariable id: Long, descricao: String): HttpResponse<Any> {
        val possivelLivro = livroRepository.findById(id)

        if(possivelLivro.isEmpty){
            return HttpResponse.notFound()
        }

        val livro = possivelLivro.get()

        livro.descricao = descricao
        livroRepository.update(livro)

        return HttpResponse.ok(DetalhesDoLivroResponse(livro))
    }

    @Delete("/{id}")
    fun deletaLivro(@PathVariable id: Long): HttpResponse<Any> {
        val possivelLivro = livroRepository.findById(id)

        if(possivelLivro.isEmpty){
            return HttpResponse.notFound()
        }

        livroRepository.deleteById(id)

        return HttpResponse.ok()
    }


}