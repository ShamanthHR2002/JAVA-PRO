package com.shamanthhr.equaltostringoverride;

public class KettleRunner {

	public static void main(String[] args) {
		
		
		 Jeans jeans1 = new Jeans("Levis", "32", "Blue", 50.0, true, "Denim");
	        Jeans jeans2 = new Jeans("Levis", "35", "Blue", 45.0, false, "Denim");
	        System.out.println("Jeans comparison: " + jeans1.equals(jeans2));  
	        

	     
	        Kettle kettle1 = new Kettle("Philips", 1.5, "Steel", true, "Silver", 2000);
	        Kettle kettle2 = new Kettle("Philips", 1.5, "Steel", false, "Silver", 1800);
	        System.out.println("Kettle comparison: " + kettle1.equals(kettle2));  

	      
	        Grinder grinder1 = new Grinder("Prestige", 3, 2.0, true, "Black", 2500);
	        Grinder grinder2 = new Grinder("Prestige", 3, 2.0, false, "Black", 2400);
	        System.out.println("Grinder comparison: " + grinder1.equals(grinder2)); 

	     
	        Saree saree1 = new Saree("SilkHouse", "Red", "Silk", 3000.0, "5m", "Traditional");
	        Saree saree2 = new Saree("SilkHouse", "Red", "Silk", 2900.0, "5m", "Modern");
	        System.out.println("Saree comparison: " + saree1.equals(saree2));  

	      
	        Bedsheet bedsheet1 = new Bedsheet("BombayDyeing", "King", "White", "Cotton", 1500.0, "Plain");
	        Bedsheet bedsheet2 = new Bedsheet("BombayDyeing", "King", "White", "Cotton", 1400.0, "Printed");
	        System.out.println("Bedsheet comparison: " + bedsheet1.equals(bedsheet2));  

	     
	        Bulb bulb1 = new Bulb("Philips", "LED", 15.0, "Warm White", 200.0, true);
	        Bulb bulb2 = new Bulb("Philips", "LED", 15.0, "Warm White", 180.0, false);
	        System.out.println("Bulb comparison: " + bulb1.equals(bulb2));  

	      
	        Gun gun1 = new Gun("Colt", "M1911", 0.45, 2.5, true, "USA");
	        Gun gun2 = new Gun("Colt", "M1911", 0.45, 2.4, false, "USA");
	        System.out.println("Gun comparison: " + gun1.equals(gun2));

	        
	        Country country1 = new Country("India", "New Delhi", 1.3, "Hindi", "INR", 3.28);
	        Country country2 = new Country("India", "New Delhi", 1.3, "English", "INR", 3.28);
	        System.out.println("Country comparison: " + country1.equals(country2));  

	     
	        State state1 = new State("Tamil Nadu", "Chennai", 78.0, "Tamil", "Governor1", 1.3);
	        State state2 = new State("Tamil Nadu", "Chennai", 78.0, "Tamil", "Governor2", 1.3);
	        System.out.println("State comparison: " + state1.equals(state2));  

	       
	        CreditCard card1 = new CreditCard("1234567890", "shamanth", "12/24", 50000.0, "ABC Bank", true);
	        CreditCard card2 = new CreditCard("1234567890", "shamanth", "12/24", 60000.0, "ABC Bank", false);
	        System.out.println("CreditCard comparison: " + card1.equals(card2));  

	       
	        Helmet helmet1 = new Helmet("Vega", "M", "Black", 1500.0, true, "ABS");
	        Helmet helmet2 = new Helmet("Vega", "M", "Black", 1400.0, false, "ABS");
	        System.out.println("Helmet comparison: " + helmet1.equals(helmet2));  
	    }
	

}
