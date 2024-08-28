package com.shamanth.inheritance280824;

public class Hat {
    public String color = "red";

    public Hat() {
        System.out.println("Hat created using no-arg constructor.");
    }

    public void shade() {
        System.out.println("Running shade in Hat.");
    }

    public void useBottle() {
        WaterBottle bottle = new WaterBottle(750, "Blue");
        bottle.fill();
        bottle.empty();
        bottle.crush();
    }
}
