package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.UserRequestDto
import com.api_vendinha.api.domain.dtos.response.UserResponseDto
import org.springframework.web.bind.annotation.ResponseStatus

// Define a interface para o serviço de usuários. As interfaces em Kotlin definem contratos que as classes concretas devem implementar.
interface UserServiceInterface {
    // Declara um método que deve ser implementado pelas classes que implementam esta interface.
    // O método recebe um DTO de solicitação (UserRequestDto) e retorna um DTO de resposta (UserResponseDto).
    fun save(userRequestDto: UserRequestDto):
            UserResponseDto
    /// Função que atualiza
    fun update(
        id:Long,
        userRequestDto: UserRequestDto
    ): UserResponseDto


     fun finduser(id: Long)
             : UserResponseDto

    fun changeStatus(id: Long, status: Boolean): UserResponseDto
}
