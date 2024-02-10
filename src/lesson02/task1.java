/*1. объявите переменные для хранения информации об общем количестве писем и о количестве отправленных писем. Присвойте
   значения этим переменным. Выведите в консоль, сколько писем осталось отправить.
 */

package lesson02;


public class task1 {
    public static void main(String[] args) {
        int allLetter, sentLetter;
        allLetter = 20;
        sentLetter = 14;

        System.out.println("Осталось отправить " + (allLetter - sentLetter) + " писем");
    }
}






