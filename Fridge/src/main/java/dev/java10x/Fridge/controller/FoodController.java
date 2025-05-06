package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

/*
A camada que recebe as requisições HTTP e devolve as respostas (REST API).

Responsabilidades:
Validar entradas (DTOs).
Chamar a camada Service e converter respostas em JSON/XML.

Use @RestController para APIs RESTful que retornam dados (JSON/XML).

Use @RequestMapping quando precisar de configurações complexas, ele define
a URL (endpoint) que o método irá atender e pode ser aplicado em nível de classe ou método.

INJEÇÃO DE DEPENDÊNCIA (DI) NO SPRING:
É quando o Spring AUTOMATICAMENTE fornece uma instância pronta em vez de você criar manualmente.

Prefira injeção por construtor na maioria dos casos. É mais seguro, testável e alinhado
com boas práticas de design imutável. O @Autowired em campos deve ser
evitado, e setters só devem ser usados quando realmente necessários.
*/