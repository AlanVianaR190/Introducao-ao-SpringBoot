package dev.java10x.Fridge.controller;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                                                                             // define que a classe é um controlador REST (retorna JSON/XML automaticamente)
@RequestMapping("/food")                                                                    // mapeia a URL base para todos os métodos (ex.: /food)
public class FoodController {

    // injeçao de dependencia
    private final FoodService foodService;
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    /* é quando o Spring automaticamente fornece uma instância pronta de FoodService
    para o FoodController (em vez de você criar manualmente com new).
    Feito via construtor (melhor prática). */

    @GetMapping                                                                             // mapeia requisições HTTP GET (para listar dados)
    public List<Food> getAll(){
        return foodService.getAll();
    }

    /* Este metodo retorna todos os alimentos (lista em JSON) - Consulta */

    @PostMapping                                                                            // mapeia requisições HTTP POST (para criar dados)
    public Food create(@RequestBody Food food){                                             // pega o JSON do corpo da requisição e transforma em um objeto Java (Food)
        return foodService.save(food);
    }

    /* Este metodo cria um novo alimento (recebe JSON no corpo) - Criação */

    @DeleteMapping("/{id}")                                                                 // mapeia requisições HTTP DELETE (para remover dados)
    public void delete(@PathVariable Long id){                                              // pega um valor da URL (ex.: /food/1 → id = 1).
        foodService.delete(id);
    }

    /* Este metodo remove um alimento pelo ID (pega da URL) - Remoção */
}

/*
Esta classe é o controlador da sua API REST. Ele recebe requisições
HTTP (GET, POST, DELETE) e as encaminha para o FoodService (que faz a lógica de negócio).
*/