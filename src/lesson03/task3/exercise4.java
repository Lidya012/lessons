//Задача #4 на switch
//Даны переменные couponNumber - номер купона и resultSum - сумма покупки.
//
//Если номер купона - 1111, 4444 или 9999 - скидка 10%,
//Если номер купона - 3333 или 7777 - скидка 20%,
//Если номер купона - 5555 - скидка 30%.
//В остальных случаях скидка не предусмотрена.
//Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена.
// Вывести значение resultSum в консоль.

package lesson03.task3;

public class exercise4 {
    public static void main(String[] args) {
        int couponNumber = 7777;
        double resultSum = 670;
        switch (couponNumber){
            case 1111, 4444, 9999 -> System.out.println("суидка 10% - "+ (resultSum -resultSum*0.1));
            case 3333, 7777 -> System.out.println("суидка 20% " + (resultSum -resultSum*0.2));
            case 5555 -> System.out.println("суидка 30%-"+ (resultSum -resultSum*0.3));
            default -> System.out.println("скидка не предусмотрена");

        }
    }
}
