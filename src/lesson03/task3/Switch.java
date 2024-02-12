//  Решите следующую задачу, используя switch:
//  Напишите программу, которая выводит в консоль
//  количество квартир на выбранном этаже.
//  1 и 2 этажи - 7 квартир
//  3 и 4 этажи - 5 квартир
//  5 этаж - 2 квартиры
//  Номер этажа хранится в переменной floorNumber.package lesson03.task3;

public class Switch {
    public static void main(String[] args) {
int floorNumber=4;
switch(floorNumber) {
    case 1, 2 -> System.out.println("7 квартир");
    case 3, 4 -> System.out.println("5 квартир");
    case 5-> System.out.println("2 квартиры");
    default -> System.out.println("неверный ввод");
}
    }
}
