//package org.launchcode.ramenu.models.forms;
//
//import com.sun.istack.internal.NotNull;
//import org.launchcode.ramenu.models.Ingredient;
//import org.launchcode.ramenu.models.RamenOrder;
//
//
//public class AddIngredientItemForm {
//
//    private RamenOrder ramenOrder;
//    private Iterable<Ingredient> ingredients;
//
//    public AddIngredientItemForm() { }
//
//    public AddIngredientItemForm(Iterable<Ingredient> ingredients, RamenOrder ramenOrder) {
//        this.ingredients = ingredients;
//        this.ramenOrder = ramenOrder;
//    }
//
//    @NotNull
//    private int ramenOrderId;
//
//    @NotNull
//    private int ingredientId;
//
//    public RamenOrder getRamenOrder() {
//        return ramenOrder;
//    }
//
//    public void setRamenOrder(RamenOrder ramenOrder){
//        this.ramenOrder = ramenOrder;
//    }
//
//    public Iterable<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public void setIngredients(Iterable<Ingredient> ingredients) {
//        this.ingredients = ingredients;
//    }
//
//    public int getRamenOrderId() {
//        return ramenOrderId;
//    }
//
//    public void setRamenOrderId(int ramenOrderId) {
//        this.ramenOrderId = ramenOrderId;
//    }
//
//    public int getIngredientId() {
//        return ingredientId;
//    }
//
//    public void setIngredientId(int ingredientId) {
//        this.ingredientId = ingredientId;
//    }
//}
