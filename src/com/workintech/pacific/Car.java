package com.workintech.pacific;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders,String name){
        this.name=name;
        this.cylinders=cylinders;
        setEngine(true);
        setWheels(4);
    }



    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
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


    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Cylinders: " + cylinders + "\n");
        builder.append("Engine: " + engine + "\n");
        builder.append("Wheels: " + wheels + "\n");
return builder.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return((Car)o).cylinders==this.cylinders &&((Car)o).name.equals(this.name);


    }



}
