package com.shamanth.inheritance270824;

public class SubChicken extends Chicken {
    String origin;
    int numberOfEggs;
    String featherType;
    String combType;
    boolean isFreeRange;

    public void layEggs() {
        System.out.println("The chicken lays " + numberOfEggs + " eggs.");
    }

    public void flapWings() {
        System.out.println("The chicken flaps its wings with a span of " + wingSpan + " cm.");
    }

    public void run() {
        System.out.println("The chicken runs at " + speed + " km/h.");
    }

    public void eat() {
        System.out.println("The chicken is eating " + diet + ".");
    }

    public void rest() {
        System.out.println("The chicken is resting.");
    }
}

