package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.RamenOrder;
import org.launchcode.ramenu.models.Ingredient;
import org.launchcode.ramenu.models.data.IngredientDao;
import org.launchcode.ramenu.models.data.RamenOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "order")
    public String displayOrderForm(Model model) {

        model.addAttribute("title", "Select Your Ingredients");
        model.addAttribute(new RamenOrder());
        model.addAttribute("ingredients", ingredientDao.findAll());

//        creates new ramen order and prints ID to verify order is created
//        RamenOrder newRamenOrder = new RamenOrder();
//        ramenOrderDao.save(newRamenOrder);
//        int newRamenOrderId = newRamenOrder.getId();
//        System.out.println("ID="+ newRamenOrderId);
//        return "order/ingredients/" + newRamenOrderId;
        return "order/ingredients";

    }
//  ingredients/{newRamenOrderId}
//  @PathVariable int newRamenOrderId,
    @RequestMapping(value = "ramenu/order", method = RequestMethod.POST)
    public String processOrderForm(@ModelAttribute RamenOrder newRamenOrder,
                                   @RequestParam int[] brothIds,
                                   @RequestParam int[] noodleIds,
                                   @RequestParam int[] toppingIds,
                                   @RequestParam float total,
                                   Model model)
    {

//        System.out.println("ID="+ newRamenOrder.getId());
        List<Integer> ingredientIds = new ArrayList<>();

//        loop through all ids and get ingredient and put into list
        for (int brothId : brothIds){ ingredientIds.add(brothId); }
        for (int noodleId : noodleIds){ ingredientIds.add(noodleId); }
        for (int toppingId : toppingIds){ ingredientIds.add(toppingId); }

        System.out.println(ingredientIds);


//      take list and put into order
        int newRamenOrderId = newRamenOrder.getId();
        System.out.println(newRamenOrder.getId());

        for (int ingredientId : ingredientIds) {
            Ingredient ingredient = ingredientDao.findOne(ingredientId);
            ramenOrderDao.findOne(newRamenOrderId);
            newRamenOrder.addItem(ingredient);
        }

        newRamenOrder.setTotal(total);

//      add order to dao and save
        ramenOrderDao.save(newRamenOrder);
        System.out.println("ID="+ newRamenOrder.getId());



//         Print tests
        System.out.println(brothIds[0]);
        System.out.println(noodleIds[0]);
        System.out.println(toppingIds[0]);
        System.out.println(total);
        System.out.println(ingredientIds);

//        return "order/ordersummary/" + newRamenOrder.getId();
        return "order/ordersummary";
    }

}
