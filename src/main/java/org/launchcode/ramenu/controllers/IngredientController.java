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
                                   @RequestParam int[] toppingIds,
                                   @RequestParam float total,
                                   RamenOrder newRamenOrder,
                                   Model model) {

        ArrayList<Integer> ingredientIds = new ArrayList<>();

//        loop through all ids and get ingredient and put into list

        for (int brothId : brothIds){ ingredientIds.add(brothId); }

        for (int noodleId : noodleIds){ ingredientIds.add(noodleId); }

        for (int toppingId : toppingIds){ ingredientIds.add(toppingId); }


        //TODO:take list and put into order

//        for (int ingredientId : ingredientIds) {
//
//            Ingredient ingredient = ingredientDao.findOne(ingredientId);
//            newRamenOrder.setIngredients(ingredientId);
//
////            Ingredient ingredient = ingredientDao.findOne(ingredientId);
////            newRamenOrder.addItem(ingredient);
//        }
////        newRamenOrder.setIngredients();

        newRamenOrder.setTotal(total);

//        add order to dao and save
        ramenOrderDao.save(newRamenOrder);


//         Print tests
        System.out.println(brothIds[0]);
        System.out.println(noodleIds[0]);
        System.out.println(toppingIds[0]);
        System.out.println(total);
        System.out.println(ingredientIds);

        return "order/ordersummary/" + newRamenOrder.getId();

    }

}
