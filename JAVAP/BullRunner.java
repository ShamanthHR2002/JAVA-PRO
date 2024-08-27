package com.shamanth.inheritance270824;

public class BullRunner {

	

	    public static void main(String[] args) {
	        SubBull myBull = new SubBull();
	        myBull.breed = "Angus";
	        myBull.age = 5;
	        myBull.weight = 800.0;
	        myBull.color = "Black";
	        myBull.isDomesticated = true;
	        myBull.hornLength = 20.0;
	        myBull.speed = 25;
	        myBull.isAggressive = false;
	        myBull.origin = "Scotland";
	        myBull.diet = "Grass";

	        System.out.println("Bull breed: " + myBull.breed);
	        System.out.println("Bull age: " + myBull.age);
	        System.out.println("Bull weight: " + myBull.weight + " kg");
	        System.out.println("Bull color: " + myBull.color);
	        System.out.println("Is domesticated: " + myBull.isDomesticated);
	        System.out.println("Horn length: " + myBull.hornLength + " cm");
	        System.out.println("Bull speed: " + myBull.speed + " km/h");
	        System.out.println("Is aggressive: " + myBull.isAggressive);
	        System.out.println("Origin: " + myBull.origin);
	        System.out.println("Diet: " + myBull.diet);

	        myBull.graze();
	        myBull.charge();
	        myBull.run();
	        myBull.rest();
	        myBull.sleep();
	    }
	}