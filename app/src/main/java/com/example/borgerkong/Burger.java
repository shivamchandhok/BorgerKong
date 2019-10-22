package com.example.borgerkong;

public class Burger {

    private int itemID;
    private String itemName;
    private String description;
    private int price;
    private String calorie;


    public Burger (int itemID, String itemName, String description, int price, String calorie){
        this.itemID= itemID;
        this.itemName= itemName;
        this.description= description;
        this.price= price;
        this.calorie = calorie;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCalorie() {
        return calorie;
    }

    public void setCalorie(String calorie) {
        this.calorie = calorie;
    }



}
