package com.example.bthotrongay18.repository;

import com.example.bthotrongay18.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository {
    List<Product> listProduct = new ArrayList<>();

    public ProductRepository() {
        Product product1 = new Product("SamSung", "ss", 23000000);
        Product product2 = new Product("Iphone", "ip", 42000000);
        Product product3 = new Product("B phone", "bp", 1000);
        Product product4 = new Product("Redmi", "rm", 6700000);
        Product product5 = new Product("Black Shark", "bs", 18000000);

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
    }

    public List<Product> getAllProduct() {
        return listProduct;
    }
}
