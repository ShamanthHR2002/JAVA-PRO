package com.shamanth.inheritance270824;

class SubSmartPhone extends SmartPhone {
    String os;
    double price;
    String color;
    boolean is5G;

    public void takePhoto() {
        System.out.println("Taking photo.");
    }

    public void browseInternet() {
        System.out.println("Browsing the internet.");
    }
}