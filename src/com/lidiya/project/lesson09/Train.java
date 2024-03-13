package com.lidiya.project.lesson09;

// от final класса нельзя наследоваться
public final class Train extends Vehicle implements Runnable{
    private int numberOfCars;

    public Train(int speed, int numberOfCars) {
        super(speed);
        this.numberOfCars = numberOfCars;
    }

    private void minusCar(){
        if (numberOfCars > 1) numberOfCars--;
    }

    // абстрактный метод родителя должен быть реализован в дочернем классе
    @Override
    public void breakVehicle() {
        upWare(3);
        minusCar();
    }

    @Override
    public void run() {
        System.out.println("Количество вагонов: " + numberOfCars + "." +
                " Поезд движется со скоростью " + getSpeed());
    }
}
