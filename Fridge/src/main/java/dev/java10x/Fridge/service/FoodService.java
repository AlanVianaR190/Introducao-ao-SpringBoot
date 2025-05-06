package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    // listar
    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    // criar
    public Food save(Food food){
        return foodRepository.save(food);
    }

    // deletar
    public void delete(Long id){
        foodRepository.deleteById(id);
    }
}

/*
A camada de lógica de negócio.

Responsabilidades:
Implementar regras complexas (validações, cálculos).
Chamar o Repository para persistir dados.
Evitar colocar lógica no Controller.

O @Service é uma anotação do Spring Framework usada para identificar
classes que contêm lógica de negócio (regras de aplicação, cálculos, processamento
de dados) em uma aplicação.
*/
