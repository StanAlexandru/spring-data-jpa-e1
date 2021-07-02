package com.jbm.springdatajpae1.product.service;

import com.jbm.springdatajpae1.product.entity.Product;
import com.jbm.springdatajpae1.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product p){
        productRepository.save(p);
    }
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
}
