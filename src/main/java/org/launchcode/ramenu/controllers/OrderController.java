package org.launchcode.ramenu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {


    @RequestMapping(value = "")
    public string index(Model model) {

        model.addAttribute("broths", ingredientsDao.findByType("broth"));
        model.addAttribute("title", "Choose a Broth | Ramenu");
        return "order/broth";
    }


}
