package br.edu.ifpr.pgua.eic.tads.models;

import java.util.ArrayList;

public class Client extends User {
    protected ArrayList<Product> cart = new ArrayList<>();

    public Client(String name, String email) {
        super(name, email);
    }

    private Boolean addProductToCart(Product product) {
        if (product == null)
            return false;
        
        this.cart.add(product);
        return true;
    }

    private ArrayList<Product> viewCart() {
        return this.cart;
    }
}
