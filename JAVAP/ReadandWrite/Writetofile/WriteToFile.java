package com.shamanth.txtfile.write;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	 public static void main(String[] args) {
	        String name = "Shamanth HR";
	        String email = "shamanthhr52@gamil.com";
	        String mobile = "9449706524";

	        try (FileWriter writer = new FileWriter("C:\\Users\\shamanth\\eclipse-workspace\\Casting\\src\\com\\shamanth\\txtfile\\write\\output.txt")) {
	            writer.write("Name: " + name + "\n");
	            writer.write("Email: " + email + "\n");
	            writer.write("Mobile: " + mobile + "\n");
	            System.out.println("Successfully wrote to the file.");
	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }
	
}
