package com.springmvclesson3.springmvc.controller;

import com.springmvclesson3.springmvc.domain.Product;
import com.springmvclesson3.springmvc.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public String getProducts(Model model){
        List<Product> products = productService.getAll();
        model.addAttribute("products",products);
        return "products";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product getProductById(@PathVariable Long id){
        return productService.findByID(id).get();
    }

}
