package com.lidiya.project.lesson09;
// Абстрактные классы:
// 1. запрещено создавать экземпляры абстрактных классов
// 2. могут иметь абстрактные методы (без реализации),
// которые должны быть реализованы в неабстрактных наследниках
abstract public class Vehicle {
    // final свойство необходимо инициализировать при объявлении или в конструкторе
    // значение final свойства нельзя изменить
    private final int speed;
    private int levelOfWare;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLevelOfWare() {
        return levelOfWare;
    }

    // final метод нельзя переопределить в дочернем классе
    public final void reduceWare(int value) {
        if (value < 1 || levelOfWare == 0) return;
        levelOfWare = Math.max(0, levelOfWare - value);
    }

    // final метод нельзя переопределить в дочернем классе
    public final void upWare(int value) {
        if (value > 0) levelOfWare += value;
    }

    // абстрактный метод - метод без реализации (без {})
    abstract public void breakVehicle();
}