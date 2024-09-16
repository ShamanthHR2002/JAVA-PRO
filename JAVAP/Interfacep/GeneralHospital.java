package com.xworkz.interfacepro;

public class  GeneralHospital implements HospitalRule {

	public void followVisitingHours() {
		System.out.println("visitors must follow the visiting hours.");
	}

	public void maintainCleanliness() {
		System.out.println("Maintain cleanliness ");
	}

	public void respectStaff() {
		System.out.println("All visitors and patients must respect the hospital staff.");
	}
}
