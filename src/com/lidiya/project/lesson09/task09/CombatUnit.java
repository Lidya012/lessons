package com.lidiya.project.lesson09.task09;


public class CombatUnit extends Unit implements Attack{
    public int getAttackPower() {
        return attackPower;
    }

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

    @Override
    public void attack(CombatUnit unit) {
        if (unit == null) return;
        if (this.getHealth() >=1) {
            unit.setHealth(unit.getHealth() - this.getAttackPower());
            System.out.println("Рыцарь " + this + " атакует " + unit);
        } else {
            System.out.println("Слишком мало здоровья, рыцарь не может атаковать");
        }
        if (unit instanceof CombatUnit) {
            this.setHealth(this.getHealth() - unit.getAttackPower());
            System.out.println("Рыцарь " + this + " получает атаку в ответ от " + unit);
        }
    }

}