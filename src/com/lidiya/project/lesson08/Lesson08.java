package com.lidiya.project.lesson08;

public class Lesson08 {
    public static void main(String[] args) {
        Unit unit = new Unit(22);
        unit.rest();
        BattleUnit battleUnit01 = new BattleUnit(10, 13, 20);
        battleUnit01.rest();
        BattleUnit battleUnit02 = new BattleUnit(10, 13, 20);
        battleUnit02.rest();

        battleUnit01.attack(unit);
        battleUnit01.attack(battleUnit02);
        battleUnit01.attack(battleUnit01);

        BattleUnit[] battleUnits = new BattleUnit[3];
        battleUnits[0] = battleUnit01;
        battleUnits[1] = battleUnit02;
        // battleUnits[2] = unit.txt;
        /*for (BattleUnit battleUnit : battleUnits) {
            battleUnit.attack(unit.txt);
        }*/
        Unit[] units = new Unit[3];
        units[0] = unit;
        units[1] = battleUnit01;
        units[2] = battleUnit02;

        for (Unit unitElem : units) {
            unitElem.rest();
        }
    }
}
