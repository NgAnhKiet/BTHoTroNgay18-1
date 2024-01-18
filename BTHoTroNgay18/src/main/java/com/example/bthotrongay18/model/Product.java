package com.example.bthotrongay18.model;

public class Product {
    private String name;
    private String details;
    private double price;

    public Product() {
    }

    public Product(String name, String details, double price) {
        this.name = name;
        this.details = details;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                '}';
    }
}
