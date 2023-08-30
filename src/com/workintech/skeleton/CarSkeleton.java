package com.workintech.skeleton;

import com.workintech.company.ElectricCar;
import com.workintech.company.GasPowerCar;
import com.workintech.company.HybridCar;

public class CarSkeleton {
    private String name;
    private String describe;

    public CarSkeleton(String name, String describe) {
        this.name = name;
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + " starting engine...";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving...";
    }

    public void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof GasPowerCar) {
            System.out.println("The car engine is starting with gas.");
        } else if (carSkeleton instanceof HybridCar) {
            System.out.println("The car engine is starting with both gas and electric.");
        }else if(carSkeleton instanceof ElectricCar){
            ((ElectricCar)carSkeleton).getAvgKmPerCharge();
            System.out.println("The car engine is starting with electric");
        }else{
            System.out.println("Car type is not valid. ");

        }
    }
}