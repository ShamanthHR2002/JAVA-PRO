package com.shamanth.inheritance270824;

public class HalwaRunner {
	 public static void main(String[] args) {
	        SubHalwa myHalwa = new SubHalwa();
	        myHalwa.flavor = "Carrot";
	        myHalwa.sweetness = 8.5;
	        myHalwa.servings = 4;
	        myHalwa.color = "Orange";
	        myHalwa.price = 5.0;
	        myHalwa.isVegan = true;

	        System.out.println("Halwa flavor: " + myHalwa.flavor);
	        System.out.println("Halwa sweetness: " + myHalwa.sweetness);
	        System.out.println("Halwa servings: " + myHalwa.servings);
	        System.out.println("Halwa color: " + myHalwa.color);
	        System.out.println("Halwa price: $" + myHalwa.price);
	        System.out.println("Is vegan: " + myHalwa.isVegan);

	        myHalwa.serve();
	        myHalwa.addNuts();
	        myHalwa.reheat();
	    }
	}


