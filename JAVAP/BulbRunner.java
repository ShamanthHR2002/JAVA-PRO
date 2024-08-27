package com.shamanth.inheritance270824;

public class BulbRunner {

	public static void main(String[] args) {
		
		
	      SubBulb myBulb = new SubBulb();
	        myBulb.type = "LED";
	        myBulb.wattage = 60;

	        System.out.println("Bulb type: " + myBulb.type);
	        System.out.println("Bulb wattage: " + myBulb.wattage);

	        myBulb.lightUp();
	        myBulb.dimLight();
	    }
	

	}


