package org.launchcode.ramenu.models;

import javax.persistence.*;
import java.util.List;


@Entity
public class Ingredient {

    @Id
    private Integer id;

    private String type;

    private String name;

    private String description;

    private Double price;

    private Integer ingredientId;

//    private Integer ramenOrderId


    // configures other side of MTM relationship with ramenOrder
    // represents the list of ramenOrder objects that a given ingredient is contained in
    @ManyToMany(mappedBy = "ingredients")
    private List<RamenOrder> ramenOrders;


    private Ingredient(Integer id, String name, String type, Double price, String description, Integer ingredientId) {
        this();
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
        this.price = price;
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


}
