package org.launchcode.ramenu.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class RamenOrder {

    @Id
    @GeneratedValue
    private int id;

    private String ingredient;

    private Float total;


    @ManyToMany
    List<Ingredient> ingredients;



    public RamenOrder() {
    }

    public  RamenOrder(String ingredient, Float total) {
        this.ingredient = ingredient;
        this.total = total;

    }

    public int getId() {
        return id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }





}
