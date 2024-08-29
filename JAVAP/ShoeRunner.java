package com.shamanth.inheritance280824;

public class ShoeRunner {
	  public static void main(String[] args) {
	       
	        Harshitha harshitha = new Harshitha();
	        harshitha.useShoe();

	        Omkar omkar = new Omkar();
	        Shoe omkarShoe = new Shoe("Adidas", 120);
	        omkar.processShoe(omkarShoe);

	        Divya divya = new Divya();
	        divya.createShoe();

	       
	        Gunashree gunashree = new Gunashree();
	        gunashree.useBottle();

	        Shwetha shwetha = new Shwetha();
	        WaterBottle shwethaBottle = new WaterBottle(1000, "Red");
	        shwetha.carryBottle(shwethaBottle);

	        Devu devu = new Devu();
	        devu.drink();
}
}
