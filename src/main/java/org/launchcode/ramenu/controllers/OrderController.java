package org.launchcode.ramenu.controllers;

import org.launchcode.ramenu.models.RamenOrder;
import org.launchcode.ramenu.models.data.IngredientDao;
import org.launchcode.ramenu.models.data.RamenOrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
                                   @RequestParam float total,
                                   Model model)
    {

        newRamenOrder.setTotal(total);

//      add order to dao and save
        ramenOrderDao.save(newRamenOrder);

        return "order/ordersummary";
    }

}
