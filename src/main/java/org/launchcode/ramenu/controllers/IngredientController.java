package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.data.IngredientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("order")
public class IngredientController {

    @Autowired
    private IngredientDao ingredientDao;

    @RequestMapping(value = "")
    public String index(Model model) {
        //System.out.println(ingredientDao.findOne(1));

        model.addAttribute("title", "Select Your Ingredients");
        model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ingredients";

    }
}
