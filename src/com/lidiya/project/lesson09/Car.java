package com.lidiya.project.lesson09;

// от final класса нельзя наследоваться

// класс может реализовывать несколько интерфейсов,
// реализуя все их абстрактные методы
public final class Car extends Vehicle implements Colorable {
    private String color;
    // final свойство необходимо инициализировать при объявлении
    // или в конструкторе, нельзя изменить после инициализации
    private final String initialColor;

    public Car(String color, int speed) {
        super(speed);
        this.color = color;
        this.initialColor = color;
    }

    @Override
    public void breakVehicle() {
        this.color = null;
        upWare(10);
    }

    @Override
    public void color(String color) {
        if (color == null || this.color.equals(initialColor)){
            this.color = color;
        }
    }

    @Override
    public void setDefaultColor() {
        this.color = initialColor;
    }

    @Override
    public void run() {
        if (getLevelOfWare() < 5)
            System.out.println("Машина движется со скоростью " + getSpeed());
    }
}