package dev.java10x.Fridge.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
A representação do dado que será persistido no banco (tabela).

@Entity = "Esta classe é uma tabela no banco de dados".

Use @Table quando precisar customizar o nome da tabela ou adicionar restrições complexas.

@Id: "Este campo é a chave primária".

@GeneratedValue: "Gere o valor dessa PK automaticamente", se não usar você precisará
definir o ID manualmente (não recomendado para PKs numéricas).
*/
