package com.survivalcoding;

public abstract class TangibleAsset {

    private String name;
    private String color;
    private int price;

    TangibleAsset(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    String getName() {
        return name;
    }

    int getPrice() {
        return price;
    }

    String getColor() {
        return color;
    }

}
