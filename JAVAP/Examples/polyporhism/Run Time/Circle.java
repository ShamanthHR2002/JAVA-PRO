package com.shamanth.example;

public  class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle: " + (Math.PI * radius * radius));
    }
}
