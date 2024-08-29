package com.shamanth.inheritance280824;

public class Shashank {
	 public void inspectChair(Chair chair) {
	        if (chair != null) {
	            chair.color();
	            chair.material();
	            System.out.println("Brand: " + chair.brand);
	            System.out.println("Cost: $" + chair.cost);
	        } else {
	            System.out.println("Chair is null.");
	        }
	    }

}
