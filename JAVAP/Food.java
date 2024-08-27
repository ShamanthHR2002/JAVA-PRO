package com.shamanth.inheritance270824;

public class Food {
    public int price;

    public Food(int price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Price: " + this.price);
    }
}