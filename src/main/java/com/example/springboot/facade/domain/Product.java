package com.example.springboot.facade.domain;

public class Product {
    public int productId;
    public String name;

    public Product(){}
    public Product(int productId, String name) {
        this.productId = productId;
        this.name = name;
    }
}
