package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.ProduRequestDto
import com.api_vendinha.api.domain.dtos.response.ProduResponseDto
import org.springframework.web.bind.annotation.ResponseStatus

// Define a interface para o serviço de usuários. As interfaces em Kotlin definem contratos que as classes concretas devem implementar.
interface ProduServiceInterface {
    // Declara um método que deve ser implementado pelas classes que implementam esta interface.
    // O método recebe um DTO de solicitação (UserRequestDto) e retorna um DTO de resposta (UserResponseDto).
    /// Função que atualiza
    fun update(
        id:Long,
        produRequestDto: ProduRequestDto
    ): ProduResponseDto

    fun save(produRequestDto: ProduRequestDto): ProduResponseDto
    fun findProdu(id: Long): ProduResponseDto
}
