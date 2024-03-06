package com.lidiya.project.lesson09;

public class lesson09 {
    public static void main(String[] args) {
        Car car = new Car();
        Train train =new Train();
        Vehicle[] vehicles = {car, train};
        for (Vehicle vehicle: vehicles){
            vehicle.breakVehicle();
            if(vehicle instanceof Car){
                Car vCar = (Car)vehicle;
                vCar.color("red");
            }
            
        }

        Vehicle train003 = new Train();
    }
}
