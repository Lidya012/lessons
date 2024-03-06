package com.lidiya.project.lesson08;

public class Unit {
    // обязательное,
    // можно менять только в методе rest
    // должно быть доступно для чтения
    protected int healthPoint; // getter
    // должно быть доступно для чтения
    private int speedPoint; // getter

    protected int initialHealthPoint;

    public Unit(int healthPoint) {
        this.healthPoint = healthPoint;
        initialHealthPoint = healthPoint;
    }

    public Unit(int healthPoint, int speedPoint) {
        this.healthPoint = healthPoint;
        this.speedPoint = speedPoint;
        initialHealthPoint = healthPoint;
    }

    public void rest(){
        if (healthPoint > 0 && healthPoint < initialHealthPoint){
            healthPoint++;
        }
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getSpeedPoint() {
        return speedPoint;
    }

    // реализовать метод void rest(): увеличивает healthPoint на 1,
    // 1. если текущее значение 0 или отрицательное число,
    // healthPoint не увеличивается
    // 2. healthPoint не может превышать изначального значения
}
