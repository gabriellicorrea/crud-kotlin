package br.com.gabi.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post

//ao invez de falar que ele é RestController é só anotar como Controller passando a rota
@Controller("/autores")
class CadastraAutorController {

    @Post
    fun cadastra(@Body request: NovoAutorRequest){
        println(request)
    }
}


