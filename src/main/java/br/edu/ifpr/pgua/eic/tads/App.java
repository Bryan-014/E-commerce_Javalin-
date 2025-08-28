package br.edu.ifpr.pgua.eic.tads;

import java.util.ArrayList;

import br.edu.ifpr.pgua.eic.tads.controllers.IndexController;
import br.edu.ifpr.pgua.eic.tads.models.Product;
import br.edu.ifpr.pgua.eic.tads.utils.JavalinUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static ArrayList<Product> dbProducts = new ArrayList<>();
    
    public static void main( String[] args ){

        var app = JavalinUtils.makeApp(7070);
        
        IndexController indexController = new IndexController();
        
        app.get("/", indexController.get);
        
    }
}
