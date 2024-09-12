package com.shamanthhr.dates;

import java.time.LocalDate;

public class FutureDateExample {
	 public static void main(String[] args) {
	        LocalDate futureDate = LocalDate.now().plusYears(5); // 5 years from now
	        System.out.println("Future Date: " + futureDate);
	    }
}
