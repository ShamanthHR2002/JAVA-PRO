package com.xworkz.interfacepro;

public class CollegeRunner {

	public static void main(String[] args) {
		CollegeRule college1 = new EngineeringCollege();

		System.out.println("College Rules for college1:");
		college1.attendClassesRegularly();
		college1.submitAssignmentsOnTime();
		college1.maintainDressCode();
		college1.participateInExams();
		college1.followLibraryRules();
		college1.respectFaculty();
		college1.maintainCleanCampus();
		college1.avoidRagging();
		college1.participateInExtracurricularActivities();
		college1.followAttendanceRequirements();

	}

}
