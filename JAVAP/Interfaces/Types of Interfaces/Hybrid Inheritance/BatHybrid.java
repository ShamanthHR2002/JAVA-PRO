package com.shamanth.inheritance.types;

public class BatHybrid extends Creature implements LandDweller, AirDweller {
	   public void walk() {
	        System.out.println("The bat hybrid can walk.");
	    }

	    public void fly() {
	        System.out.println("The bat hybrid can fly.");
	    }

}
