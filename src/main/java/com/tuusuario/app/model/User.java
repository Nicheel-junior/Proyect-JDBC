package com.tuusuario.app.model;

public class User {
    private final long id;
    private final String name;
    private final String email;

    public  User(long id, String email, String name){
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public long getId(){ return id;}

    public String email(){ return email;}

    public String name(){ return name;}
}
