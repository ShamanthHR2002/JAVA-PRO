package com.shamanth.inheritance280824;

public class Omkar {
	 void processShoe(Shoe shoe) {
	        if (shoe != null) {
	            shoe.safeGuard();
	            shoe.enhanceWalk();
	        } else {
	            System.out.println("Shoe is null.");
	        }
	    }

}
