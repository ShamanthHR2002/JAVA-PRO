package com.shamanthhr.casting;

public class Dancer {
	
		
	public void use(Belt belt) 
	{
		belt.tie();
		
	     
	     if (belt instanceof LeatherBelt) {
	         LeatherBelt leatherBelt = (LeatherBelt) belt; 
	         leatherBelt.clip(); 

	}
	
	
	}

   
}

