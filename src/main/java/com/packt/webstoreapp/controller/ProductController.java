package com.packt.webstoreapp.controller;

import com.packt.webstoreapp.domain.Product;
import com.packt.webstoreapp.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

/**
 * Created by Szymon on 2017-04-25.
 */
@Controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping("/products")
    public String list (Model model) {
        model.addAttribute("products", productRepository.getAllProducts());
        return "products";
    }



}
