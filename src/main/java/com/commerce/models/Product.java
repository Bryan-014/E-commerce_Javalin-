package com.commerce.models;

import java.util.UUID;

public class Product {
    private final UUID id;
    private String name;
    private Double price;
    private Integer stock;

    public Product(String name, Double price, Integer stock) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String showInfos() {
        return "";
    }
}
