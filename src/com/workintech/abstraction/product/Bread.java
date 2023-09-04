package com.workintech.abstraction.product;

public class Bread extends ProductForSale {
    private String flourType;
    private String color;
    public Bread(String type, double price, String description,String flourType,String color) {
        super(type, price, description);
        this.flourType=flourType;
        this.color=color;
    }

    public String getFlourType() {
        return flourType;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void showDetails() {
        String result= super.toString();
        StringBuilder builder=new StringBuilder();
        builder.append("Color:"+ color+"\n");
        builder.append("FlourType:"+ flourType+"\n");
        builder.append("***************");
        System.out.println(result+builder.toString());
    }
}
