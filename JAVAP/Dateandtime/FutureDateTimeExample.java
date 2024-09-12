package com.shamanthhr.dates;
import java.time.LocalDateTime;

public class FutureDateTimeExample {
	 public static void main(String[] args) {
	        LocalDateTime futureDateTime = LocalDateTime.now().plusMonths(6); 
	        System.out.println("Future DateTime: " + futureDateTime);
	    }
}
