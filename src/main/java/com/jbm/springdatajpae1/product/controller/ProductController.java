package com.jbm.springdatajpae1.product.controller;

import com.jbm.springdatajpae1.product.entity.Product;
import com.jbm.springdatajpae1.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/products")
    public void addProduct(
            @RequestBody Product product){
        productService.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
