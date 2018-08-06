package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.Ingredient;
import org.launchcode.ramenu.models.data.IngredientDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("order")
public class IngredientController {

    private IngredientDao ingredientDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Select Your Ingredients");
        model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ingredients";

    }
}
