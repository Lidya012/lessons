package com.lidiya.project.lesson08;

    public class BattleUnit extends Unit {
        // healthPoint можно менять только в методе rest и attack
        private int attackPoint; // обязательное,
        // должно быть доступно для чтения getter


        public BattleUnit(int attackPoint, int healthPoint, int speedPoint) {
            // super(7, 34); // вызов конструктора родителя
            super(healthPoint, speedPoint);
            this.attackPoint = attackPoint;
        }

        public BattleUnit(int attackPoint, int healthPoint) {
            // super(7); // вызов конструктора родителя
            super(healthPoint);
            this.attackPoint = attackPoint;
        }

        public int getAttackPoint() {
            return attackPoint;
        }

        // переопределить метод родителя
        // public void rest(){}
        // можно понижать тип данных возвращаемого значения

    /*public void attack(BattleUnit unit.txt) {
    }*/

        public void attack(Unit unit) {

        }

        @Override
        public void rest() {
            if (healthPoint > 0 && healthPoint < initialHealthPoint) {
                healthPoint += 2;
            }
        }

    }
// свойства
// конструкторы
// сеттеры и геттеры
// собственные методы (без @Override)
// переопределенные методы

