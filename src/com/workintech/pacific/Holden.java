package com.workintech.pacific;

public class Holden extends Car {

    public Holden(int cylinders,String name) {
        super(cylinders,name);
    }
    public String startEngine(){
        System.out.println("Class Name: "+ getClass().getSimpleName());
        return "The car's engine is starting.";
    }
    public String accelerate(){
        System.out.println("Class Name: "+getClass().getSimpleName());
        return "The car is accelerating.";
    }

    public String brake(){
        System.out.println("Class Name: "+getClass().getSimpleName());
        return "The car is braking.";
    }

}
