package com.shamanth.example.block.Instanceblock;

public class MyClass11 {
	 int instanceVar;

	    
	    {
	        System.out.println("Instance block is executed.");
	        instanceVar = 5;
	    }

	    public MyClass11() {
	        System.out.println("Constructor is called.");
	    }

	    public void display() {
	        System.out.println("Instance variable value: " + instanceVar);
	    }

}
