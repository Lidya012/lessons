package com.lidiya.project.lesson09.task09;


public class CombatUnit extends Unit{
    private  int attackPower;

CombatUnit(int health, int speed, int money, int attackPower) {
    super(health, speed, money);

    if (attackPower < 0) throw new IllegalArgumentException("Сила атаки должна быть больше 0");
    this.attackPower = attackPower;
}

    @Override
    public void rest() {
        if (getHealth() > 0 && getHealth() < getMaxhealth()-2)
            setHealth(getHealth() + 2);

    }
}