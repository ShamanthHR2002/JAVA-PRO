package com.xworkz.interfaceabstraction;

public class VarshiniPG implements PGRules
{
	@Override
	public void costPerMonth() {
		System.out.println("Cost Per Month:4000");
	}

	@Override
	public void wifi() {
		System.out.println("Wifi is available");
}
}