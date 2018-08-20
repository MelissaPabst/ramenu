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
        model.addAttribute("ingredients", ingredientDao.findAll());

        return "order/ingredients";

    }

//    @RequestMapping(value = "", method = RequestMethod.POST)
//    public String processOrderForm(@RequestParam int[] brothIds,
//                                   @RequestParam int[] noodleIds,
//                                   @RequestParam int[] toppingIds,
//                                   @RequestParam float[] total,
//                                   RamenOrder newRamenOrder) {
//
//        RamenOrder newRamen = new RamenOrder();
//
//        for (int brothId : brothIds, int noodleId: noodleIds, int toppingId : toppingIds, float total) {
//            ramenOrderDao.save(newRamenOrder);
//
//        }
//
//        return "redirect:";
//
//    }

}
