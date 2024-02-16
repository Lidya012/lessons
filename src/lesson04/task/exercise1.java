
/*Пользователь загадывает число в диапазоне от [1 до 100].
Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
Программа пытается его угадать (вместо обычного перебора постарайтесь
использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и, в зависимости от ответа пользователя, принимать решения.
Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА
Для вывода текста и значения переменной используйте оператор сложения, например System.out.println("Число равно " + number);

a = 1; b = 100; mid = (100 + 1) / 2

*/
package lesson04.task;

import java.util.Scanner;

    public class exercise1 {
        public static void main(String[] args) {

            int min = 1, max =100, mid = 0;
            int answer;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Загадайте число в диапазаоне от 1 до 100 включительно");

            while (true) {
                if (max - min == 1) {
                    break;
                }
                mid = (max + min) / 2;
                System.out.println("Ваше число больше " + mid + "?");
                answer = scanner.nextInt();
                if (answer == 1) {
                    max = mid;
                    continue;
                }
                if (answer == 0) {
                    max = mid;
                    continue;
                }
            }
            if (min == 1) {
                System.out.println("Ваше число больше " + min + "?");
                answer = scanner.nextInt();
                if (answer == 1)
                    System.out.println("Загаданное число " + max);
                else
                    System.out.println("Загаданное число " + min);
            } else {
                System.out.println("Загаданное число " + max);
            }

        }

    }


