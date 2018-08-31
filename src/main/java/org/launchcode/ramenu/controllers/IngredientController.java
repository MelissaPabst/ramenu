package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.RamenOrder;
import org.launchcode.ramenu.models.Ingredient;
import org.launchcode.ramenu.models.data.IngredientDao;
import org.launchcode.ramenu.models.data.RamenOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("order")
public class IngredientController {

    @Autowired
    private IngredientDao ingredientDao;

    @Autowired
    private RamenOrderDao ramenOrderDao;

    @RequestMapping(value = "")
    public String displayOrderForm(Model model) {

        model.addAttribute("title", "Select Your Ingredients");
        model.addAttribute(new RamenOrder());
        model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ingredients";

    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processOrderForm(@RequestParam int[] brothIds,
                                   @RequestParam int[] noodleIds,
                                   @RequestParam int[] toppingIds,//array maybe
                                   @RequestParam float[] total,
                                   RamenOrder newRamenOrder,
                                   Model model) {

        ArrayList<Integer> ingredients = new ArrayList<>();

        for (int brothId : brothIds){ ingredients.add(brothId); }

        for (int noodleId : noodleIds){ ingredients.add(noodleId); }

        for (int toppingId : toppingIds){ ingredients.add(toppingId); }

//        newRamenOrder.setIngredients(ingredients.add(item));
        ramenOrderDao.save(newRamenOrder);

//        ingredientList = loop through all ids and get ingredient and put into list
        //take list and put into order
        //add order to dao and save


        // put all the id's into ingredient list, be sure to change ramenOrder to hold ingredient list instead of string
//        for (int brothId : brothIds) {
//            ramenOrderDao.save(newRamenOrder);
//
//        }
    //ask it to print values c if it does n e thing

        System.out.println(brothIds[0]);
        System.out.println(noodleIds[0]);
        System.out.println(toppingIds[0]);

        System.out.println(ingredients);

        //model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ordersummary";

    }

}
