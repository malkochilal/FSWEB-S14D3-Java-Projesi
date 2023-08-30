package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String name, String describe,double avgKmPerLitre,int batterySize,int cylinders) {
        super(name, describe);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize=batterySize;
        this.cylinders=cylinders;
    }
}
