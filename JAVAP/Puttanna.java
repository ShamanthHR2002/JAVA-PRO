package com.shamanth.inheritance300824;

public class Puttanna {
	public void off(Smartphone smartphone)
	{
		if(smartphone !=null)
		{
			smartphone.operate();
			smartphone.display();
		}
		else {
			System.out.println("smartphone is null");
		}
	}

}
