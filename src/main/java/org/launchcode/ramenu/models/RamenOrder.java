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

//    public void addIngredient(Ingredient ingredient){
//        ingredients.add(ingredient);
//    }
//
//    public void addTotal(Ingredient total) {
//        ingredients.add(total);
//    }

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
