package com.shamanth.inheritance.datatype30;

public class Police {
	public void hold(Gun gun)
	{
		if(gun !=null)
		{
			gun.fire();
			gun.display();
		}
		else {
			System.out.println("Gun is Null");
		}

	}

}
