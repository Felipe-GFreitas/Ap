package com.api_vendinha.api.domain.dtos.request

// Define um DTO (Data Transfer Object) que é usado para transportar dados de entrada para operações relacionadas a usuários.
data class ProduRequestDto(
    // Propriedade que armazena o nome do usuário. É uma string não nula.
    val name: String,
    val quantidade: Int,
    val preco: Float
)