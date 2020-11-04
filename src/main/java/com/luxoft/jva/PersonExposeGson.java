package com.luxoft.jva;

import com.google.gson.annotations.Expose;

public class PersonExposeGson {

    @Expose
    private int id;

    @Expose
    private String name;

    private String password;

    public PersonExposeGson() {
    }

    public PersonExposeGson(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
