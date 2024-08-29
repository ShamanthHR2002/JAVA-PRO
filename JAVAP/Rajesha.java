package com.shamanth.inheritance300824;

public class Rajesha {
	private Smartphone smartphone;

	public Rajesha(Smartphone smartphone) {
		this.smartphone=smartphone;
	}

	public void damage()
	{
		if(smartphone !=null) {
			smartphone.display();
		}
		else {
			System.out.println("Smartphone is Null");
		}
	}

}
