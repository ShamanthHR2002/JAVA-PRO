package com.shamanthhr.dates;
import java.time.LocalDateTime;

public class PastDateTimeExample {
	 public static void main(String[] args) {
	        LocalDateTime pastDateTime = LocalDateTime.of(2000, 1, 1, 10, 30); 
	        System.out.println("Past DateTime: " + pastDateTime);
	    }
}
