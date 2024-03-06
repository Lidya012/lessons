package com.lidiya.project.lesson09.task09;

public class King extends Unit{
    private CombatUnit[] army;
    private int index = 0;
    public static final int maxCombatUnit = 20;
    public King(int health, int speed){
        super(health,speed, 500);
        army = new CombatUnit[maxCombatUnit];
    }
public void rest(){
    if (getHealth() > 0 && getHealth() < getMaxhealth()-5 && getMoney() >0){
        setHealth(getHealth()+5);
        setMoney(getMoney()-2);

    }

}
public  void armyRecruiment(CombatUnit[] units){
    if (getMoney() < 200) {
        System.out.println("Недостаточно средств, чтобы нанять армию юнитов");
        return;
    }
    if (units.length>20){
        System.out.println("Недостаточно места для набора юнитов");
        return;
    }
    int unitsCount = 0;
    while (unitsCount< units.length){
        if (army[index] == null) {
            army[index]  =  units[unitsCount];
            index++;
            unitsCount++;
        }
        if (index == 19){
            System.out.println("Набор в армию завершен");
            break;
        }
    }
    setMoney(getMoney() - 200);

}
    public  void armyRecruiment(CombatUnit unit){
        if (getMoney() < 12) {
            System.out.println("Недостаточно средств, чтобы воспользоваться заменой юнита");
            return;
    }
        boolean flag = false;
        for  (int i = 0; i < army.length; i++){
            if (army[i].getHealth() < 1){
                Unit tempUnit = army[i];
                army[i] = unit;
                flag = true;
                System.out.println("В армии заменили юнита " + tempUnit + " на " + army[i]);
                break;
            }
        }
        if (!flag) System.out.println("Все юниты в армии здоровы");
        setMoney(getMoney() - 12);
    }
}
