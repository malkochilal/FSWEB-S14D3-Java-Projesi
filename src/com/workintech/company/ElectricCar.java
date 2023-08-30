package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;
    public ElectricCar(String name, String describe,double avgKmPerCharge,int batterySize) {
        super(name, describe);
        this.avgKmPerCharge=avgKmPerCharge;
        this.batterySize=batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
