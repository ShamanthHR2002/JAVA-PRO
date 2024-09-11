package com.shamanth.example.Chainingsuper;

public class Child extends Parent{
	  public Child() {
	        super();  
	        System.out.println("Child class no-arg constructor");
	    }

	    public Child(String name) {
	        super(name); 
	        System.out.println("Child class parameterized constructor: " + name);
	    }

}
