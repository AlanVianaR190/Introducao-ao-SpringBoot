package dev.java10x.Fridge.repository;

import dev.java10x.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}

/*
A camada que acessa o banco de dados (CRUD).

Responsabilidades:
Herdar JpaRepository para operações prontas.
Criar queries customizadas.

<Food, Long> significa:
- Food: a entidade JPA que este repositório gerencia
- Long: o tipo da chave primária (@Id) da entidade
(Spring usa isso para gerar automaticamente os métodos CRUD)

*/