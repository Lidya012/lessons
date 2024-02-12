//Решите следующую задачу, используя if else:
        //  Даны 3 числа, вывести в консоль наибольшее из них

package lesson03.task3;

public class IfElse1 {
    public static void main(String[] args) {
        int a = 34, b = 54, c = 21;
        if (a > b && a > c) {
            System.out.println("Наибольшее число " + a);
        } else if (b > a && b > c) {
            System.out.println("Наибольшее число " + b);
        } else System.out.println("Наибольшее число " + c);
    }
}
