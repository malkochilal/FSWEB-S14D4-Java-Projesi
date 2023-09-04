package com.workintech.abstraction.product;

public class Chocolate extends ProductForSale {
    private String color;
    private boolean hasSugar;
    public Chocolate(String type, double price, String description,String color,boolean hasSugar) {
        super(type, price, description);
        this.color=color;
        this.hasSugar=hasSugar;
    }
//PrductForSale abstract olduğu için override yazılmalı
    @Override
    public void showDetails() {
       String result= super.toString();
       StringBuilder builder=new StringBuilder();
       builder.append("Color:"+ color+"\n");
        builder.append("HasSugar:"+ hasSugar+"\n");
        builder.append("***************");
        System.out.println(result+builder.toString());
    }
}
