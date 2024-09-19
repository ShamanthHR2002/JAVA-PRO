package com.xworkz.interfaceabstraction;

public class Runner {
	public static void main(String[] args) {
		TrafficRule trafficRule = new MangaloreTraffic();
		trafficRule.licenceNo();

		MallRule mallRule = new GTmall();
		mallRule.validId();

		PGRules pgRules = new VarshiniPG();
		pgRules.costPerMonth();
		pgRules.wifi();
	}
}
