package com.lidiya.project.lesson09.task09;

public class Doctor extends Unit implements HealthrReplenishment {
    int recoveryHeaith;

    public Doctor(int health, int speed, int money, int recoveryHeaith) {
        super(health, speed, money);
        this.recoveryHeaith= recoveryHeaith;
    }

    public int getRecoveryHeaith() {
        return recoveryHeaith;
    }

    @Override
    public void health(Unit unit) {
            unit.setHealth(unit.getHealth() + getRecoveryHeaith());
        }

}