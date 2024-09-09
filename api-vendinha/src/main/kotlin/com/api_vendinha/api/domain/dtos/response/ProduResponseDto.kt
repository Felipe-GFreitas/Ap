package com.api_vendinha.api.domain.dtos.response

data class ProduResponseDto(
    // Propriedade que armazena o ID do usuário. Pode ser nulo (Long?).
    val id: Long?,

    // Propriedade que armazena o nome do usuário. É uma string não nula.
    val name: String,

    val quantidade: Int,

    val preco: Float

)
