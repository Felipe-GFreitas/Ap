package com.api_vendinha.api.domain.entities

import jakarta.persistence.*

// Marca a classe como uma entidade JPA que será mapeada para uma tabela no banco de dados.
// Define que a entidade é associada à tabela "users".
@Table(name = "Produtos")
@Entity
data class Produ (
    // Marca o campo id como a chave primária da entidade.
    // A geração automática do valor do id é gerenciada pelo banco de dados.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true)
    val id: Long? = null, // O id pode ser nulo inicialmente antes de ser atribuído pelo banco de dados.

    // Define a coluna "name" na tabela, onde será armazenado o nome do usuário.
    @Column(name = "name")
    var name: String, // O nome do usuário é uma string não nula.

    @Column(name = "quantidade")
    var quantidade:Int,

    @Column(name = "preco")
    var preco:Float
)
