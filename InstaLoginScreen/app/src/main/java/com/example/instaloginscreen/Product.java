package com.example.instaloginscreen;


public class Product {
    private String name;
    private String description;
    private double price;
    private int imageResourceId;

    private String phoneNumber;
    public Product(String name, String description, double price, int imageResourceId,String phoneNumber) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
        this.phoneNumber= phoneNumber;
    }

    // Getter methods
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getPrice() { return price; }
    public int getImageResourceId() { return imageResourceId; }


    public String getPhoneNumber() {
        return phoneNumber;
    }
}