package com.shamanth.inheritance280824;

public class Harshitha {
	 Shoe shoe = new Shoe("Nike", 100);

	    void useShoe() {
	        if (shoe != null) {
	            shoe.safeGuard();
	            shoe.enhanceWalk();
	        } else {
	            System.out.println("Shoe is null.");
	        }
	    }

}
