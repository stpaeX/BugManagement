package com.example.testing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("bugForm", new bugTicket());
        return "index";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute bugTicket bug, Model model) {
        System.out.println(bug.toString());
        model.addAttribute("bugForm", new bugTicket());
        return "index";
    }
}
