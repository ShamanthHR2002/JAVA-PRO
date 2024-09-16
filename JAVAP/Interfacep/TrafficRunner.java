package com.xworkz.interfacepro;

public class TrafficRunner {

	public static void main(String[] args) {

		CityTraffic cityTraffic1 = new CityTraffic();

		System.out.println("Traffic Rules for cityTraffic1:");
		cityTraffic1.followSpeedLimit();
		cityTraffic1.wearSeatbelt();
		cityTraffic1.obeyTrafficSignals();
		cityTraffic1.stopForPedestrians();
		cityTraffic1.useIndicators();
		cityTraffic1.maintainLaneDiscipline();
		cityTraffic1.avoidUsingMobileWhileDriving();
		cityTraffic1.followNoParkingSigns();
		cityTraffic1.followOneWay();
		cityTraffic1.doNotDrinkAndDrive();
		cityTraffic1.avoidOvertakingFromLeft();
		cityTraffic1.followZebraCrossing();
		cityTraffic1.giveWayToEmergencyVehicles();
		cityTraffic1.followHelmetRule();
		cityTraffic1.followChildSafetyLaws();

	}
}
