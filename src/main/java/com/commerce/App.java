package com.commerce;

import com.commerce.controllers.ProductsController;
import java.util.HashMap;

import freemarker.template.Configuration;
import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;
import io.javalin.rendering.template.JavalinFreemarker;
import java.util.Map;

import com.commerce.controllers.ProductsController;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Configuration cfg = new Configuration(Configuration.VERSION_2_3_34);
        cfg.setClassForTemplateLoading(App.class, "/templates");
        cfg.setDefaultEncoding("UTF-8");

        Javalin app = Javalin.create(config -> {
            config.staticFiles.add(staticFiles -> {
                staticFiles.directory = "/public";
                staticFiles.location = Location.CLASSPATH;
                config.fileRenderer(new JavalinFreemarker(cfg));
            });
        }).start(7070);

        defineRoutes(app);

        app.get("/", ctx -> {
            Map<String, String> model = Map.of("nome", "bryan");
            ctx.render("index.html", model);
        });
    }

    public static void defineRoutes(Javalin app) {
        ProductsController productsController = new ProductsController();

        app.get("/products", productsController.list);
        app.get("/products/create", productsController.create);
        app.get("/products/{id}", productsController.get);
        app.get("/products/{id}/edit", productsController.edit);
        app.post("/products/post", productsController.post);
        app.post("/products/{id}/update", productsController.update);
        app.post("/products/{id}/delete", productsController.delete);
    }
}