package com.shamanth.inheritance270824;

public class SubBull extends Bull {

	double hornLength;
    int speed;
    boolean isAggressive;
    String origin;
    String diet;

    public void charge() {
        System.out.println("The bull charges.");
    }

    public void rest() {
        System.out.println("The bull is resting.");
    }

    public void run() {
        System.out.println("The bull runs at " + speed + " km/h.");
    }

    public void sleep() {
        System.out.println("The bull is sleeping.");
    }

    public void eat() {
        System.out.println("The bull is eating " + diet + ".");
    }
}
