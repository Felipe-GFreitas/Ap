package com.api_vendinha.api.controller


import com.api_vendinha.api.domain.dtos.request.ProduRequestDto
import com.api_vendinha.api.domain.dtos.response.ProduResponseDto
import com.api_vendinha.api.domain.service.ProduServiceInterface
import org.springframework.web.bind.annotation.*

// Marca a classe como um controlador REST do Spring, que irá lidar com requisições HTTP e retornar respostas diretamente no corpo da resposta.
@RestController
// Define o caminho base para todos os endpoints dentro deste controlador. Neste caso, todos os endpoints começam com "/user".
@RequestMapping("/pedido")
class ProduController (
    // Injeção de dependência do serviço de usuário. O controlador usa este serviço para processar dados relacionados a usuários.
    val produService: ProduServiceInterface
) {
    // Mapeia este método para responder a requisições POST no caminho "/pedido/save".
    @PostMapping("/salvar")
    // O método recebe um objeto `UserRequestDto` no corpo da requisição, e retorna um objeto `UserResponseDto` após chamar o serviço para salvar o usuário.
    fun save(@RequestBody produRequestDto: ProduRequestDto) : ProduResponseDto {
        // Chama o método `save` do serviço de usuário passando o DTO recebido e retorna o resultado.
        return produService.save(produRequestDto)
    }
    // Mapeia este método para responder a requisições POST no caminho "/pedido/id".
    @PutMapping("/{id}")
    fun update(
        @PathVariable id: Long,
        @RequestBody produRequestDto: ProduRequestDto
    ):ProduResponseDto{
        return produService.update(id, produRequestDto)
    }

    @GetMapping ("{id}")
    fun findProdu(@PathVariable id:Long):ProduResponseDto {
        return produService.findProdu(id)
    }
    }