package dev.java10x.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity                                                     // define que a classe é uma entidade JPA (ou seja, uma tabela no banco)
@Table(name = "food_table")                                 // especifica o nome da tabela no banco (opcional; se não usar, vira food)
public class Food {

    @Id                                                     // marca o campo como chave primária (identificador único)
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // define como o ID é gerado (ex.: autoincremento).
    private Long id;

    private String name;
    private Integer quantity;
    private LocalDate expirationDate;

    public Food() {
    }

    public Food(Long id, String name, Integer quantity, LocalDate expirationDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }
}

/*
A classe Food é um modelo que representa um alimento, definindo a estrutura de um "alimento" no sistema
(como se fosse uma ficha cadastral), cada campo (name, quantity, etc.) vira uma coluna na tabela do banco de dados.
*/
