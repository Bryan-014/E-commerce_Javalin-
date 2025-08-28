package br.edu.ifpr.pgua.eic.tads.models;

import br.edu.ifpr.pgua.eic.tads.App;

public class Admin extends User{
    public Admin(String name, String email) {
        super(name, email);
    }

    private Boolean createProduct(Product product) {
        if (product == null)
            return false;

        App.dbProducts.add(product);
        return true;
    }

    private void removeProduct(Product product) {

    }
}
