package com.shamanth.inheritance270824;

class SubHalwa extends Halwa {
    String color;
    double price;
    boolean isVegan;

    public void addNuts() {
        System.out.println("Adding nuts to the halwa.");
    }

    public void reheat() {
        System.out.println("Reheating halwa.");
    }
}