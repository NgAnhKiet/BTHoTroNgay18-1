package com.example.bthotrongay18.controller;

import com.example.bthotrongay18.model.Product;
import com.example.bthotrongay18.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping()
    public String home(){
        return "/home";
    }

    @GetMapping("/list")
    public String list(Model model){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("list", productList);
        return "/list";
    }
}
