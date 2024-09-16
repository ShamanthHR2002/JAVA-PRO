package com.xworkz.interfacepro;

public class HospitalRunner {
	public static void main(String[] args) {

		HospitalRule hospital1 = new GeneralHospital();

		

		System.out.println("Hospital 1 Rules:");
		hospital1.followVisitingHours();
		hospital1.maintainCleanliness();
		hospital1.respectStaff();

		
	}
}
