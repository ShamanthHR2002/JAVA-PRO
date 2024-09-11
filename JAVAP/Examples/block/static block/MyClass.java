package com.shamanth.example.block;

public class MyClass {
	 static int staticVar;

	  
	    static {
	        System.out.println("Static block is executed.");
	        staticVar = 10;
	    }

	    public MyClass() {
	        System.out.println("Constructor is called.");
	    }

	    public void display() {
	        System.out.println("Static variable value: " + staticVar);
	    }
	

}
