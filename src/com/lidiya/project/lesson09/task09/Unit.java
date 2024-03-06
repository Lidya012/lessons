package com.lidiya.project.lesson09.task09;

public abstract class Unit {
    private int health;
    private int speed;
    private int money;

    public Unit(int heath, int speed, int money) {
        if (heath < 0) throw new IllegalArgumentException("Здоровье не может быть меньше 0");
        if (speed < 0) throw new IllegalArgumentException("Скорость не может быть отрицательной");
        if (money < 0) throw new IllegalArgumentException("Количество денег должно быть больше либо равно 0");
        this.health = heath;
        this.speed = speed;
        this.money = money;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxhealth() {
        return maxhealth;
    }

    public void setMaxhealth(int maxhealth) {
        this.maxhealth = maxhealth;
    }



    private int maxhealth;

    public void rest() {
        if ((health > 0) && (health < maxhealth)) {
            health++;
//
        }
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}