package org.launchcode.ramenu.models;

import javax.persistence.*;


@Entity
public class Ingredient {

    @Id
    private Integer id;

    private String name;

    private String type;

    private Double price;

    private String description;

    private Integer ingredientId;

//    //many ingredients for one order
//    @ManyToOne
//    private Order order;


    private Ingredient(Integer id, String name, String type, Double price, String description, Integer ingredientId) {
        this();
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
        this.ingredientId = ingredientId;
    }

    //default no-arg constructor
    public Ingredient() { }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
}
