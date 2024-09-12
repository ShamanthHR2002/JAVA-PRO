package com.shamanth.txtfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
	 public static void main(String[] args) {
	        String filePath = "C:\\Users\\shamanth\\eclipse-workspace\\Casting\\src\\com\\shamanth\\txtfile\\shamanth.txt";
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}
