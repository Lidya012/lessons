package com.lidiya.project.lesson09.task09;

public class Infantryman extends CombatUnit implements Attack{
    private Infantryman(int heath, int speed, int money, int attackPower) {
        super(heath, speed, money, attackPower);

    }
    public void attack(CombatUnit unit) {
        if (unit == null) return;
        if (this.getHealth() > 1){
            unit.setHealth(unit.getHealth() - this.getAttackPower());
            System.out.println("Пехотинец " + this + " атакует " + unit);
        } else {
            System.out.println("Слишком мало здоровья, пехотинец не может атаковать");
        }
        if (unit.getHealth() < 5){
            unit.setHealth(unit.getHealth() - this.getAttackPower());
            System.out.println("Пехотинец " + this + " атакует " + unit);
        }
    }
}
