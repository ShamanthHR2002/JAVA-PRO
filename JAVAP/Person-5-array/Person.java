package com.shamanthhr.Person;

public class Person {
	 private String name;
	    private String email;
	    private int age;
	    private String mobileNo;

	    public Person(String name, String email, int age, String mobileNo) {
	        this.name = name;
	        this.email = email;
	        this.age = age;
	        this.mobileNo = mobileNo;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Email: " + email + ", Age: " + age + ", Mobile No: " + mobileNo;
	    }
}
