package com.api_vendinha.api.domain.service

import com.api_vendinha.api.domain.dtos.request.ProduRequestDto
import com.api_vendinha.api.domain.dtos.response.ProduResponseDto
import com.api_vendinha.api.domain.entities.Produ
import com.api_vendinha.api.infrastructure.repository.ProduRepository
import org.springframework.stereotype.Service

// Marca a classe como um componente de serviço do Spring, o que permite que o Spring a gerencie e a injete em outros componentes.
@Service
class ProduServiceImpl (
    // Injeção de dependência do repositório de usuários. O repositório é usado para acessar e manipular dados no banco de dados.
    private val produRepository: ProduRepository
): ProduServiceInterface {

    // Implementa o método definido na interface UserServiceInterface.
    // Recebe um UserRequestDto e retorna um UserResponseDto.
    override fun save(produRequestDto: ProduRequestDto): ProduResponseDto {
        // Cria uma nova instância da entidade User usando os dados do DTO.
        val produ = produRepository.save(
            Produ(
                // Define o nome do usuário a partir dos dados fornecidos no DTO.
                name = produRequestDto.name,
                quantidade = produRequestDto.quantidade,
                preco = produRequestDto.preco
            )
        )

        // Cria e retorna um UserResponseDto com o ID e nome do usuário salvo.
        return ProduResponseDto(
            id = produ.id,
            name = produ.name,
            preco = produ.preco,
            quantidade = produ.quantidade
        )
    }

    override fun update(id:Long, produRequestDto: ProduRequestDto): ProduResponseDto{
        val produ = produRepository.findById(id).orElseThrow {
            IllegalArgumentException("Erro");
        }
        produ.name = produRequestDto.name
        produ.quantidade = produRequestDto.quantidade
        produ.preco= produRequestDto.preco

        val produUpdate = produRepository.save(produ)

        return ProduResponseDto(
            id = produUpdate.id,
            name = produUpdate.name,
            quantidade = produUpdate.quantidade,
            preco = produUpdate.preco
        )
    }

    override fun findProdu(id: Long): ProduResponseDto {
        val produ = produRepository.findById(id).orElseThrow {
            IllegalArgumentException("Não encontrado");
        }

        return ProduResponseDto(
            id = produ.id,
            name = produ.name,
            quantidade = produ.quantidade,
            preco = produ.preco
        )
    }

}