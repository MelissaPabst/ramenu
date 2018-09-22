package org.launchcode.ramenu.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
public class Ingredient {

    @Id
    private Integer id;

    private String type;

    private String name;

    private String description;

    private BigDecimal price;

    // configures other side of MTM relationship with ramenOrder
    // represents the list of ramenOrder objects that a given ingredient is contained in
    @ManyToMany(mappedBy = "ingredients")
    private List<RamenOrder> ramenOrders;

    private Ingredient(Integer id, String name, String type, BigDecimal price, String description) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
