package lesson04;

import java.util.Scanner;

public class ForAndWhile {
    public static void main(String[] args) {
        // WHILE / DO WHILE / FOR

        // I. Цикл WHILE позволяет выполнять последовательность действий,
        //  пока проверяемое условие истинно. Условие всегда проверяется до тела цикла.
        //  Чаще используется, когда число итераций (повторений) неизвестно
        /*
        while (логическое выражение / условие) {
            тело цикла - инструкции, которые необходимо выполнять,
            пока 'условие' истинно
        }
        */

        // Пользователь вводит положительные целые числа.
        // 1. Нужно найти их сумму. +
        // 2. Количество.
        // 3. Среднее арифметическое.
        // 4. Максимальное.
        // для использования Scanner необходим import java.util.Scanner;
        // до объявления класса
        Scanner scanner01 = new Scanner(System.in);
        System.out.println("Вводите положительные целые числа");
        int userInput;
        int sum = 0;
        int counter = 0;
        int maxNumber = 0;
        double avg = 0;
        while (scanner01.hasNextInt() && (userInput = scanner01.nextInt()) > 0) {
            sum += userInput;
            counter += 1;
            if (userInput > maxNumber) maxNumber = userInput;
        }
        avg = (double) sum / counter;
        System.out.println(sum);
        System.out.println(counter);
        System.out.println(avg);

        // break continue метки

        Scanner scanner02 = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое положительное число или " +
                    "0 для выхода из программы");
            userInput = scanner02.nextInt();
            if (userInput == 0) { // если пользователь введет 0
                break; // выход из текущего цикла
            }
            if (userInput < 0) { // если пользователь введет отрицательное число
                continue; // переход на следующую итерацию к проверке условия
                // в круглых скобках
            }
            // инструкции будут выполнены,
            // если пользователь введет положительное число
            System.out.println(userInput * userInput);
        }

        // II. Цикл DO WHILE позволяет выполнять последовательность действий,
        //  пока проверяемое условие истинно.
        //  Первая итерация выполняется без проверки условия
        //  Далее условие проверяется до тела цикла.
        //  Чаще используется, когда число итераций (повторений) неизвестно
        // и первая итерация выполняется безусловно
        /*
        do {
            тело цикла - инструкции, которые необходимо выполнять,
            пока 'условие' истинно
        } while (логическое выражение / условие);
        */

        Scanner scanner03 = new Scanner(System.in);
        // Пользователь должен вводить числа до тех пор,
        // пока число не будет находиться в диапазоне [9; 90)
        // от 9 (включая 9) до 90 (исключая 90)
        int min = 9, max = 90;
        int answer = 0;
        do {
            System.out.println("Введите число");
            if (scanner03.hasNextInt()) answer = scanner03.nextInt();
            else scanner03.next();
            /*} while (!(answer >= min && answer < max));*/
        } while (answer < min || answer >= max);

        System.out.println("Ваше число принято");


        /*
        1. Программа загадывает число в диапазоне [0;9)
        2. Пользователь вводит число с клавиатуры
        3. Программа в зависимости от введенного числа выводит в консоль следующее:
        1) "загаданное число больше"
        2) "загаданное число меньше"
        3) "Вы угадали" (программа завершает работу)
        4. Если введен -1, вывести "выход из программы" (программа завершает работу)
        */

        // Возвести число 'x' в степень 'k'. Использовать цикл.


        // III. FOR
        // for (; ;) {} // синтаксически правильный бесконечный цикл for

        // for (инициализация; условие; обновление) {
        //    тело цикла
        // }
        // инициализация - выполняется один раз при входе в цикл
        // условие - проверяется каждый раз перед выполнением тела цикла
        // обновление - выполняется после завершения тела цикла, перед проверкой условия
        // тело цикла выполняется, если условие истинно
        // Обычно используется, когда число итераций известно,

        // Известна цена за 1кг. яблок.
        // Нужно вывести цену за 1кг, 2кг, 3кг, 4кг, 5кг.
        double price = 200; // за 1 кг.
        for (int quantity = 1; quantity <= 5; quantity++) {
            double currentPrice = quantity * price;
            System.out.println(quantity + "кг. " + " стоят " + currentPrice);
        }

        /*
        1
        12
        123
        1234
        12345
        123456 System.out.print(1);
        */
        // fori
        for (int first = 1; first <= 6; first++) {
            for (int second = 1; second <= first ; second++) {
                System.out.print(second);
            }
            System.out.println();
        }

        // ссылочный тип
        char oneChar = '1';
        String oneStr = "1";
        String stringVar01 = "строка";
        String stringVar02 = "строка";
        // String str01 = new String("строка");
        // String str02 = new String("строка");
        stringVar02 = stringVar02.toUpperCase(); // "СТРОКА"
        // сравнение
        System.out.println(stringVar01.equals(stringVar02));
        String s = null;

        // heap
        // "строка"
        // "строка"
        // string pool
        // "1"
        // "строка"
        // "СТРОКА"


        // Вывести на экран первые
        // 10 элементов последовательности 2 4 6 8 10 и тд


        // Метки
        /*
        name_of_loop: while ( условие ) {
            while ( условие ) {
                выход из текущего цикла
                if ( условие ) break;

                выход из цикла с именем name_of_loop
                if ( условие ) break name_of_loop;
            }
        }
        */
    }
}