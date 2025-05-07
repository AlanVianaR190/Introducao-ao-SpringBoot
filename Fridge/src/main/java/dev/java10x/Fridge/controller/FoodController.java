package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    // injeçao de dependencia
    private final FoodService foodService;
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAll(){
        return foodService.getAll();
    }
    /* este método será chamado quando a requisição GET for feita, o Spring converte
    automaticamente essa lista em JSON ou XML, para a resposta HTTP */

    @PostMapping
    public Food create(@RequestBody Food food){
        return foodService.save(food);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        foodService.delete(id);
    }

    /* esse método serve para criar um novo alimento (objeto Food) no
    sistema, é o equivalente a um INSERT no banco de dados, mas via API HTTP.*/
}

/*
A camada que recebe as requisições HTTP e devolve as respostas (REST API).

Responsabilidades:
Validar entradas (DTOs).
Chamar a camada Service e converter respostas em JSON/XML.

@RestController para APIs RESTful que retornam dados (JSON/XML).

@GetMapping: Mapeia requisições GET para um método, ele define
a URL (endpoint) que o método irá atender e pode ser aplicado em nível de classe ou método.

INJEÇÃO DE DEPENDÊNCIA (DI) NO SPRING:
É quando o Spring AUTOMATICAMENTE fornece uma instância pronta em vez de você criar manualmente.

Prefira injeção por construtor na maioria dos casos. É mais seguro, testável e alinhado
com boas práticas de design imutável. O @Autowired em campos deve ser
evitado, e setters só devem ser usados quando realmente necessários.

@PostMapping é uma anotação do Spring Framework usada para mapear requisições HTTP POST em
um método específico

@RequestBody é usado para ler dados do corpo da requisição e convertê-los em objetos Java.
*/