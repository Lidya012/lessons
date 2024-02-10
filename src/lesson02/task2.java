/*Объявить и инициализировать переменные для хранения времени (в часах) и расстояния (в километрах).
Найти и вывести в консоль скорость, выраженную в метрах в секунду.
 */

package lesson02;

public class task2 {
    public static void main(String[] args) {
        int hour = 3;
        double km =37.8;
        hour = 3 *60;
        km = 37.8 * 1000;
        System.out.println((hour*km)+ " км/с" );

    }



}
