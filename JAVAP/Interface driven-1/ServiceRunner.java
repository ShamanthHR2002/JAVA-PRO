package com.xworkz.Interface19092024;

public class ServiceRunner {

    public static void main(String[] args) {
        Service service = new Service();
        Repositary serviceImp1 = new serviceImp1();
        service.setRepositary(serviceImp1);

        String result = service.push();
        System.out.println("Result: " + result);

      
    }
}