package com.commerce.models;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    private Double total;
    private String description;
    private LocalDateTime creatAt;
    private LocalDateTime finalAt;

    public Cart(Double total, String description, LocalDateTime creatAt, LocalDateTime finalAt) {
        this.products = new ArrayList<>();
        this.total = total;
        this.description = description;
        this.creatAt = creatAt;
        this.finalAt = finalAt;
    }

    public Cart(LocalDateTime creatAt) {
        this.products = new ArrayList<>();
        this.total = 0.0;
        this.description = "Pendente";
        this.creatAt = creatAt;
    }

    public ArrayList<Product> getProducts() {
        return this.products;
    }
}