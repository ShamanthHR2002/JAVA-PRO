package com.shamanth.inheritance280824;

public class ChairRunner {
	

	    public static void main(String[] args) {
	        
	        Shamanth shamanth = new Shamanth();
	        shamanth.useChair();

	       
	        Shashank shashank = new Shashank();
	        Chair chairForPerson2 = new Chair("Wayfair", 180);
	        shashank.inspectChair(chairForPerson2);

	       
	        Nagaraj nagaraj = new Nagaraj();
	        nagaraj.purchaseChair();
	    }
	}

