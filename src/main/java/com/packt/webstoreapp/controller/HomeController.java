package com.packt.webstoreapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Szymon on 2017-04-25.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model m) {
        m.addAttribute("greeting", "Witaj w sklepie");
        m.addAttribute("tagline", "nananna");
        return "welcome";
    }
}

