package com.example.assignment5project;

public class Noodles {
    private String id;
    private String name;
    private String location;
    private String category;
    private String cost;

    public Noodles (String id, String name, String location, String category, String cost){
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.cost = cost;

    }

    public String getId() { return id; }
    public String getName() {return this.name;}
    public String getLocation() {return this.location;}
    public String getCategory() {return this.category;}
    public String getCost() {return this.cost;}

    @Override
    public String toString() {return name;}


}
