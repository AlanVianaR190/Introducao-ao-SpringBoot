package dev.java10x.Fridge.service;

import dev.java10x.Fridge.model.Food;
import dev.java10x.Fridge.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service                                                                                // marca a classe como um serviço gerenciado pelo Spring (permite injeção de dependência)
public class FoodService {

    // injeção de dependencia
    private final FoodRepository foodRepository;
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    /* A injeção de dependência funciona igual no Controller e no Service, mas:
    O Controller depende do Service.
    O Service depende do Repository. */

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    /* Retorna todos os alimentos do banco (usa findAll() do Repository). */

    public Food save(Food food){
        return foodRepository.save(food);
    }

    /* Salva um novo alimento no banco (usa save() do Repository). */

    public void delete(Long id){
        foodRepository.deleteById(id);
    }

    /* Remove um alimento pelo ID (usa deleteById() do Repository). */
}

/*
Esta classe é a camada de serviço da sua aplicação Spring Boot, ela contém
a lógica de negócio e se comunica com o banco de dados
*/
