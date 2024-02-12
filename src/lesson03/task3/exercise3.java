/*Задача #3 на switch
Дана переменная monthNumber, которая хранит порядковый номера месяца.
И переменная isLeap, которая хранит информацию о том, является ли год високосным.

Написать программу, которая в зависимости от значения monthNumber выводит в консоль количество дней в этом месяце.
Необходимо рассмотреть два случая: год не является високосным и год является високосным.package lesson03.task3;
*/
public class exercise3 {
    public static void main(String[] args) {
        int monthNumber = 6, isLeap =361;//год високосный
        switch (monthNumber) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
            case 4, 6, 9, 11 -> System.out.println("30 день");
            case 2 -> System.out.println("29 день");
            default  -> System.out.println("неверный ввод");
        }

}
}