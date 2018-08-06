package org.launchcode.ramenu.models;


@Entity
public class Ingredient {

    @Id
    private Integer id;

    private String name;

    private String type;

    private String description;

    private int ingredientId;


    private Ingredient(String name, String type, String description, int ingredientId) {
        this();
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.ingredientId = ingredientId;
    }

    //default no-arg constructor
    public Ingredient() { }

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
