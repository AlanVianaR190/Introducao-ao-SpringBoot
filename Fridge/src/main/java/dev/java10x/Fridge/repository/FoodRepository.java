package dev.java10x.Fridge.repository;

import dev.java10x.Fridge.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {         // Food: A entidade JPA (classe model) que será gerenciada. Long: O tipo da chave primária (@Id) da entidade.

    /* JpaRepository é uma interface do Spring Data JPA que já inclui todas
    as operações básicas de CRUD (herdadas de CrudRepository). */

}

/*
Esta interface é a camada de acesso a dados da sua aplicação. Ela é a
ponte entre o código Java e o banco de dados permitindo operações CRUD (Create, Read, Update, Delete)
sem escrever SQL manualmente, traduzindo métodos Java em consultas SQL automaticamente.
*/