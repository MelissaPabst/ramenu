package org.launchcode.ramenu.models;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RamenOrder {

    @Id
    @GeneratedValue
    private int id;

    private BigDecimal total;

    //used to hold all items in the ramenOrder
    @ManyToMany
    List<Ingredient> ingredients;

    //default constructor
    public RamenOrder() { }

    public RamenOrder(BigDecimal total) {
        this.total = total;
    }

    public void addItem(Ingredient item) {

        ingredients.add(item);
    }

    public int getId() {
        return id;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

}
