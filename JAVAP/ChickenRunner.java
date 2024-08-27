package com.shamanth.inheritance270824;

public class ChickenRunner {

	public static void main(String[] args) {
		
		 SubChicken myChicken = new SubChicken();
	        myChicken.breed = "Leghorn";
	        myChicken.age = 2;
	        myChicken.weight = 2.5;
	        myChicken.color = "White";
	        myChicken.isLayingEggs = true;
	        myChicken.eggProduction = 300;
	        myChicken.diet = "Corn";
	        myChicken.wingSpan = 70.0;
	        myChicken.speed = 15;
	        myChicken.isBroiler = false;
	        myChicken.origin = "Italy";
	        myChicken.numberOfEggs = 6;
	        myChicken.featherType = "Soft";
	        myChicken.combType = "Single";
	        myChicken.isFreeRange = true;

	        System.out.println("Chicken breed: " + myChicken.breed);
	        System.out.println("Chicken age: " + myChicken.age);
	        System.out.println("Chicken weight: " + myChicken.weight + " kg");
	        System.out.println("Chicken color: " + myChicken.color);
	        System.out.println("Is laying eggs: " + myChicken.isLayingEggs);
	        System.out.println("Egg production: " + myChicken.eggProduction + " eggs/year");
	        System.out.println("Diet: " + myChicken.diet);
	        System.out.println("Wing span: " + myChicken.wingSpan + " cm");
	        System.out.println("Speed: " + myChicken.speed + " km/h");
	        System.out.println("Is broiler: " + myChicken.isBroiler);
	        System.out.println("Origin: " + myChicken.origin);
	        System.out.println("Number of eggs: " + myChicken.numberOfEggs);
	        System.out.println("Feather type: " + myChicken.featherType);
	        System.out.println("Comb type: " + myChicken.combType);
	        System.out.println("Is free range: " + myChicken.isFreeRange);

	        myChicken.cluck();
	        myChicken.layEggs();
	        myChicken.flapWings();
	        myChicken.run();
	        myChicken.rest();
	    }
	

	}


