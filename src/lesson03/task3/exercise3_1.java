/*Задача #3 на switch
Дана переменная monthNumber, которая хранит порядковый номера месяца.
И переменная isLeap, которая хранит информацию о том, является ли год високосным.

Написать программу, которая в зависимости от значения monthNumber выводит в консоль количество дней в этом месяце.
Необходимо рассмотреть два случая: год не является високосным и год является високосным.package lesson03.task3;
*/
public class exercise3_1 {
    public static void main(String[] args) {
        int monthNumber = 2, isLeap =360;//год обычный
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 день");
            case 2 -> System.out.println("28 день");
            default  -> System.out.println("неверный ввод");
        }

    }
}