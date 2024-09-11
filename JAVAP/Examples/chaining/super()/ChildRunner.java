package com.shamanth.example.Chainingsuper;

public class ChildRunner {
	 public static void main(String[] args) {
	        System.out.println("Creating Child object with no-arg constructor:");
	        Child child1 = new Child();   

	        System.out.println("\nCreating Child object with parameterized constructor:");
	        Child child2 = new Child("John"); 
	    }
}
