package com.shamanthhr.Person;

public class PersonRunner {
	 public static void main(String[] args) {
	        Person person1 = new Person("Shamanth", "shamanth@gmail.com", 22, "9449706524");
	        Person person2 = new Person("shashank", "shashank@gmail.com", 21, "9449706522");
	        Person person3 = new Person("nagaraj", "nagaraj@gmail.com", 23, "9449706521");
	        Person person4 = new Person("sachin", "sachin@gmail.com", 28, "9449706525");
	        Person person5 = new Person("bargav", "bargav@gmail.com", 27, "9449706528");

	        
	        Person[] persons = {person1, person2, person3, person4, person5};

	        
	        for (Person person : persons) {
	            System.out.println(person);
	        }
	    }
}
