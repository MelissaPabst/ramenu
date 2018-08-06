package org.launchcode.ramenu.models;
import javax.persistence.*;


public class Ingredient {

    private String name;

    private String type;

    private String description;

    private int ingredientId;


    private Ingredient(String name, String type, String description, int ingredientId) {
        this();
        this.name = name;
        this.type = type;
        this.description = description;
        this.ingredientId = ingredientId;

    }

    //default constructor
    public Ingredient() {

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

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }
}
