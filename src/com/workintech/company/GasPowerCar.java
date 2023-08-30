package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class GasPowerCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;
    public GasPowerCar(String name, String describe,double avgKmPerLitre,int cylinders) {
        super(name, describe);
        this.avgKmPerLitre=avgKmPerLitre;
        this.cylinders=cylinders;
    }
}
