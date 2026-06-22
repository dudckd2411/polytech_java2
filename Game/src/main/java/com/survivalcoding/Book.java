package com.survivalcoding;

public class Book extends TangibleAsset {
    String isbn;


    Book(String name, int price, String color) {
        super(name, price, color);
        this.isbn = isbn;
    }

    String getIsbn() {
        return isbn;
    }
}
