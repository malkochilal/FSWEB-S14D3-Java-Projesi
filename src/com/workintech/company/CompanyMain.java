package com.workintech.company;

import com.workintech.skeleton.CarSkeleton;

public class CompanyMain {
    public static void main(String[] args) {
        CarSkeleton car1=new ElectricCar("Tesla","Tesla aracıdır.",100,10);
        CarSkeleton car2=new GasPowerCar("Mercedes","c180",0.88,4);
        car1.drive();
        car2.drive();
    }
}
