package com.survivalcoding;

public class Computer extends TangibleAsset {
    private String makerName;

    Computer(String name, int price, String color) {
        super(name, price, color);
        this.makerName = makerName;
    }

    String getMakerName() {
        return makerName;
    }
}
