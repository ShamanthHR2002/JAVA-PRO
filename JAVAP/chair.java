package com.shamanth.inheritance280824;

public class Chair {
	public String brand;
    public double cost;

    public Chair(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public void color() {
        System.out.println("The chair color is black.");
    }

    public void material() {
        System.out.println("The chair material is metal.");
    }
}
