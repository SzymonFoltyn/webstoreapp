package com.packt.webstoreapp.controller;

import com.packt.webstoreapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Szymon on 2017-04-26.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping ("/order/S100/2")
    public String process() {
        orderService.processOrder("S100",2);
        return "redirect:/products";
    }

}
