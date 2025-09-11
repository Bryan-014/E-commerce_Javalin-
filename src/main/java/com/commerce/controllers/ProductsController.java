package com.commerce.controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;


public class ProductsController {
    public Handler list = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler index = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler create = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler edit = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler get = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler post = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler update = (Context ctx)->{
        ctx.render("index.ftl");
    };

    public Handler delete = (Context ctx)->{
        ctx.render("index.ftl");
    };
}
