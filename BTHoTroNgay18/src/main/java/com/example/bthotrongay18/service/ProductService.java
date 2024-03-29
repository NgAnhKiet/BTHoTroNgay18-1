package com.example.bthotrongay18.service;

import com.example.bthotrongay18.model.Product;
import com.example.bthotrongay18.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.getAllProduct();
    }
}
