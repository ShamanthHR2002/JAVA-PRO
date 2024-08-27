package com.shamanth.inheritance270824;

public class SmartPhoneRunner {

	public static void main(String[] args) {
		  SubSmartPhone myPhone = new SubSmartPhone();
	        myPhone.brand = "Apple";
	        myPhone.model = "iPhone 14";
	        myPhone.storage = 256;
	        myPhone.ram = 4;
	        myPhone.os = "iOS";
	        myPhone.price = 999.99;
	        myPhone.color = "Black";
	        myPhone.is5G = true;

	        System.out.println("SmartPhone brand: " + myPhone.brand);
	        System.out.println("SmartPhone model: " + myPhone.model);
	        System.out.println("SmartPhone storage: " + myPhone.storage + "GB");
	        System.out.println("SmartPhone RAM: " + myPhone.ram + "GB");
	        System.out.println("SmartPhone OS: " + myPhone.os);
	        System.out.println("SmartPhone price: $" + myPhone.price);
	        System.out.println("SmartPhone color: " + myPhone.color);
	        System.out.println("Is 5G: " + myPhone.is5G);

	        myPhone.call();
	        myPhone.takePhoto();
	        myPhone.browseInternet();
	    }
	

	}


