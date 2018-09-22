package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.Ingredient;
import org.launchcode.ramenu.models.RamenOrder;
import org.launchcode.ramenu.models.data.IngredientDao;
import org.launchcode.ramenu.models.data.RamenOrderDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("ramenu")
public class OrderController {

    @Autowired
    private IngredientDao ingredientDao;

    @Autowired
    private RamenOrderDao ramenOrderDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Welcome to Ramenu!");
        return "index";
    }

    @RequestMapping(value = "login")
    public String displayLoginForm(Model model) {
        model.addAttribute("title", "Log In | Ramenu");
        return "user/login";
    }

    @RequestMapping(value = "signup")
    public String displaySignupForm(Model model) {
        model.addAttribute("title", "Sign UP | Ramenu");
        return "user/signup";
    }

    @RequestMapping(value = "order", method = RequestMethod.GET)
    public String displayOrderForm(Model model) {

        model.addAttribute("title", "Select Your Ingredients");
        model.addAttribute(new RamenOrder());
        model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ingredients";

    }
    
    @RequestMapping(value = "order", method = RequestMethod.POST)
    public String processOrderForm(@ModelAttribute RamenOrder newRamenOrder,
                                   @RequestParam int brothId,
                                   @RequestParam int noodleId,
                                   @RequestParam int[] toppingIds,
//                                   @RequestParam BigDecimal total,
                                   Model model) {

//        create list to hold ingredientIds
        List<Integer> ingredientIds = new ArrayList<>();

//        loop through all ids and get ingredient id and put into list
        ingredientIds.add(brothId);
        ingredientIds.add(noodleId);
        for (int toppingId : toppingIds) {
            ingredientIds.add(toppingId);
        }

//        take list and put into order
        int newRamenOrderId = newRamenOrder.getId();

//        create list to hold ingredients
        List<Ingredient> ingredients = new ArrayList<>();

//        loop through ingredientIds and add to ingredients
        for (int ingredientId : ingredientIds) {
            Ingredient ingredient = ingredientDao.findOne(ingredientId);
            ingredients.add(ingredient);
        }
        
        newRamenOrder.setIngredients(ingredients);

        BigDecimal total = new BigDecimal(0);

        for (int ingredientId : ingredientIds) {
            Ingredient ingredient = ingredientDao.findOne(ingredientId);
            BigDecimal ingredientPrice  = ingredient.getPrice();
            total = total.add(ingredientPrice);
        }

        newRamenOrder.setTotal(total);

        ramenOrderDao.save(newRamenOrder);

        model.addAttribute("title", "Review Order Number: " + newRamenOrder.getId());
        model.addAttribute("newRamenOrderId", newRamenOrder.getId());
        model.addAttribute("ingredients", newRamenOrder.getIngredients());
        model.addAttribute("total", newRamenOrder.getTotal());

        return "order/ordersummary";
    }

//    @RequestMapping(value = "edit", method = RequestMethod.GET)
//    public String displayEditOrder(@ModelAttribute RamenOrder newRamenOrder,
//                              Model model) {
//
//        model.addAttribute("newRamenOrder", newRamenOrder);
//        model.addAttribute("ingredients", ingredientDao.findAll());
//        model.addAttribute("title", "Edit Order");
//
//        return "order/edit";
//
//    }

//    @RequestMapping(value = "pay", method = RequestMethod.GET)
//    public String payForOrder(@ModelAttribute RamenOrder newRamenOrder,
//                                   Model model) {
//    }




}
