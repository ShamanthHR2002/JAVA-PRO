package com.shamanth.inheritance300824;

public class SmartphoneRunner {
	public static void main(String[] args) {

		Vinay vinay= new Vinay();
		vinay.use();
		System.out.println("........................");

		Puttanna puttanna = new Puttanna();
		Smartphone smartphone=new Smartphone("samsung", "s24", 150000);
		puttanna.off(smartphone);
		System.out.println("......................");

		
		
		Rajesha rajesha=new Rajesha(smartphone);
		rajesha.damage();
		System.out.println("...........................");


		Harisha harisha = new Harisha();
		harisha.repare();

	}

}
