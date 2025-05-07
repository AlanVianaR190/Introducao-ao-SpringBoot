package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    // injeção de dependencia
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

@Service: Indica que a classe contém lógica de negócio.
*/
