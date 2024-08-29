package com.shamanth.inheritance280824;

public class Devu {
	 WaterBottle bottle = new WaterBottle(500, "Green");

	    void drink() {
	        if (bottle != null) {
	            bottle.empty();
	        } else {
	            System.out.println("Bottle is null.");
	        }
	    }

}
