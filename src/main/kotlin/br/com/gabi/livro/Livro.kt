package br.com.gabi.livro

import io.micronaut.core.annotation.Introspected
import javax.persistence.*

@Entity
@Introspected
data class Livro (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column
    val nome: String,
    @Column
    val autor: String,
    @Column
    var descricao: String
)