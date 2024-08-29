package com.shamanth.inheritance280824;

public class Nagaraj {
	  public void purchaseChair() {
	        Chair chair = new Chair("HomeDepot", 200);
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
