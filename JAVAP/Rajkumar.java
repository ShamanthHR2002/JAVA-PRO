package com.shamanth.inheritance280824;

public class Rajkumar {
	public Hat hat;

	public void fold() {
		if (hat != null) {
			hat.shade();
			System.out.println(hat.color);
		} else {
			System.out.println("Hat is null....");
		}
	}

}
