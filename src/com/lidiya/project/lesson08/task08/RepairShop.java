package com.lidiya.project.lesson08.task08;

import java.util.Arrays;

public class RepairShop {
    private Vehicle[] vehicles = new  Vehicle[3];
    private  int indexVehicle =0;
    public void addVehicle(Vehicle vehicle){
        if (vehicle == null)
            throw  new IllegalArgumentException("Добавьте транспортное средство");
        vehicles[indexVehicle] = vehicle;
        indexVehicle++;
    }
    public void  repairAll(){
        indexVehicle=0;
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].repair();
            vehicles[i] =null;

        }
    }

    public void  printVehicles(){
        System.out.println(Arrays.toString(vehicles));

    }
}
