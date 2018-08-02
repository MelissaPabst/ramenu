package org.launchcode.ramenu.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private BrothDao brothDao;


    @RequestMapping(value = "")
    public string index(Model model) {

        model.addAttribute("broths", brothDao.findAll());
        model.addAttribute("title", "Choose a Broth | Ramenu");
        return "order/broth";
    }


}
