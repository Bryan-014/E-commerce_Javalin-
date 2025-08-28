package br.edu.ifpr.pgua.eic.tads.models;

import java.util.UUID;

public class User {
    protected UUID id;
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.id = UUID.randomUUID();
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String showInfos() {
        return "";
    }
}
