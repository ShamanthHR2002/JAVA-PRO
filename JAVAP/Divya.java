package com.shamanth.inheritance280824;

public class Divya {
	 void createShoe() {
	        Shoe shoe = new Shoe("Puma", 80);
	        if (shoe != null) {
	            shoe.safeGuard();
	            shoe.enhanceWalk();
	        } 
	        else {
	            System.out.println("Shoe is null.");
	        }
	    }

}
