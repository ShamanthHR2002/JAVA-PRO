package com.xworkz.Interface19092024;

public class Service {
	private Repositary repositary;

	public void setRepositary(Repositary repositary) {
		this.repositary = repositary;
	}

	public String push() {
		System.out.println("Running push in service");
		if (repositary != null) {
			boolean saved = repositary.save();
			if (saved) {
				System.out.println("Saved in repo");
				return "Success";
			} else {
				System.out.println("Not saved in repo");
				return "Failure";
			}
		} else {
			System.out.println("Repositary is null");
			return "Failure";
		}
	}
}