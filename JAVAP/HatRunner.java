package com.shamanth.inheritance280824;

public class HatRunner {

	public static void main(String[] args) {

		Naga naga = new Naga();
		naga.wear();
		
		
		yash yash = new yash();
	    Hat hat = new Hat();
	    yash.tear(hat);
	    
	    
	    Rajkumar rajkumar =  new Rajkumar();
	    Hat hat2=new Hat();
	    rajkumar.hat =hat2;
	    rajkumar.fold();
	    
	}

}
