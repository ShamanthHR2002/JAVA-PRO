package com.xworkz.interfacepro;

public class RailwayStationRunner {
	public static void main(String[] args) {

		RailwayStationRule station1 = new CityRailwayStation();
		System.out.println("Railway Station Rules for station1:");
		station1.buyTicketsBeforeBoarding();
		station1.followPlatformSigns();
		station1.maintainQueueDiscipline();
		station1.respectLuggageLimit();
		station1.avoidLittering();
		station1.followSafetyInstructions();
		station1.keepYourTicketHandy();
		station1.useDesignatedWaitingAreas();
		station1.adhereToTrainTimings();
		station1.avoidUnattendedBaggage();
		station1.useCrossingsAtDesignatedPoints();
		station1.followRailwayAnnouncements();
		station1.avoidSmokingInStationPremises();
		station1.keepVolumeLowOnMobileDevices();
		station1.followStaffInstructions();

	}

}
