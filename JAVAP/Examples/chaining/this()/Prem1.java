package com.shamanth.example.Chainingthis;

public class Prem1 {
	 private int age;
	    private String name;

	   
	    public Prem1() {
	        this(25, "D Name");  
	        System.out.println("No-arg constructor of Prem class");
	    }

	    
	    public Prem1(int age, String name) {
	        this.age = age;
	        this.name = name;
	        System.out.println("Parameterized constructor of Prem1 class: Age = " + age + ", Name = " + name);
	    }

	    
	    public void display() {
	        System.out.println("Age: " + age + ", Name: " + name);
	    }

}
