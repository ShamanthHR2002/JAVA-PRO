package com.shamanth.inheritance.types;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
        manager.work();  
        manager.manage(); 

        Developer developer = new Developer();
        developer.work();  
        developer.code(); 
	}

}
