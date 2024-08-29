package com.shamanth.inheritance280824;

public class WaterBottle {
	 double quantity;
	    String color;

	    WaterBottle(double quantity, String color) {
	        this.quantity = quantity;
	        this.color = color;
	    }

	    void fill() {
	    	 System.out.println("----------------------------------------");
	    }

	    void empty() {
	    	 System.out.println("----------------------------------------");	    }

	    void crush() {
	        System.out.println("Bottle crushed.");
	    }
}
