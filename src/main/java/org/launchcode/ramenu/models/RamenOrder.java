package org.launchcode.ramenu.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class RamenOrder {

    @Id
    @GeneratedValue
    private int id;

    private Float total;

    //used to hold all items in the ramenOrder
    @ManyToMany
    List<Ingredient> ingredients;

    public RamenOrder() { }

    public RamenOrder(Float total) {
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

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

}
