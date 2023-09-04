package com.workintech.abstraction.product;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public double getSalesPrice(int quantity){
        return getPrice()*quantity;
    }
    public abstract void showDetails();
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("*************\n");
        builder.append("Type:" + type +"\n");
        builder.append("Price:" + price +"\n");
        builder.append("Description:" + description +"\n");
        builder.append("Class Type:" +getClass().getSimpleName()+"\n");
        return builder.toString();
    }
}
