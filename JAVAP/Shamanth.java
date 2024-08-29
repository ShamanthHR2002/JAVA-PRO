package com.shamanth.inheritance280824;

public class Shamanth {
	  public Chair chair = new Chair("Ikea", 150);

	    public void useChair() {
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
