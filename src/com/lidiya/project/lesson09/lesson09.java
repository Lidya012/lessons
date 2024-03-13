package com.lidiya.project.lesson09;

public class lesson09 {
    public static void main(String[] args) {
        Car car = new Car("yellow", 240);
        Train train = new Train(310, 10);

        Vehicle[] vehicles = {car, train};

        for (Vehicle vehicle : vehicles) {
            vehicle.breakVehicle();
            // если объект принадлежит типу Runnable,
            // оператор instanceof вернет true
            if (vehicle instanceof Runnable) {
                Runnable runnableVehicle = (Runnable) vehicle;
                runnableVehicle.run();
            }
            // если объект принадлежит типу Runnable,
            // оператор instanceof вернет true
            // и выполнит приведение к типу Colorable
            // colorableVehicle -доступ к объекту по новой ссылке
            if (vehicle instanceof Colorable colorableVehicle){
                colorableVehicle.setDefaultColor();
            }
        }

        Building building = new Building();
        Colorable colorableBuilding = new Building();
        Runnable runnableBuilding = new Building();

        ColorEvent colorEvent = new ColorEvent();
        colorEvent.setColorables(new Colorable[]{colorableBuilding, car});
        colorEvent.changeColor();


    }

}

