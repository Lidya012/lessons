package lesson05;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;

public class StringsLesson {
    public static void main(String[] args) {
        // char (примитивный тип данных) 16 бит - символ Unicode
        char char01 = 'J'; // сам символ в одинарных кавычках
        // но "J" - строка, ссылочный тип String
        char char02 = 74; // номер символа в таблице Unicode в диапазоне от 0 до 65535
        char char03 = '\u0044'; // 16ричное представление в escape последовательности

        System.out.print(char01);
        System.out.print(char02);
        System.out.print(char03);

        System.out.println('\uD83D');
        System.out.println('\uDC3E');

        System.out.println("\uD83D\uDC3E"); // суррогатная пара

        // каждый символ юникода может быть
        // представлен одним char или парой (суррогатная пара) char

        String string01 = "Cat";
        String string02 = "Cat";
        String string03 = new String("Cat");

        // arr.length
        System.out.println(string01.length());//количество символов

        // Сравнение ссылок   ведет ссыдка к одному объекту памяти
        System.out.println(string01 == string02); // true   храняться в пуле, код один и тот же, ведут две переменные
        System.out.println(string01 == string03); // false   в хип памяти , не в пуле

        // сравнение строк
        string01 = "Строка";
        string02 = "строка";
        if (string01.equals(string02)) System.out.println("Строки равны");
        if (string01.equalsIgnoreCase(string02)) System.out.println("Строки равны без учета регистра");

        if (string01.compareTo(string02) < 0) { // или compareToIgnoreCase - без учета регистра
            System.out.println(string01 + " меньше " + string02);
        } else if (string01.compareTo(string02) > 0) { // или compareToIgnoreCase - без учета регистра"
            System.out.println(string01 + " больше " + string02);
        } else {
            System.out.println("Строки равны");

        }

        // верхний и нижний регистр
        string01 = " JaVa ";
        string02 = " deVEloPEr ";
        String upperString = string01.toUpperCase();
        String lowerString = string02.toLowerCase();
        System.out.println(upperString);
        System.out.println(lowerString);


        // удаление пробелов с начала и конца строки
        // проверка на последовательность символов в начале и конце строки
        // замена символов
        // string01.startsWith();
        // "str".startsWith();
        // upperString.strip().startsWith()
        // trim U+0020
        // " JaVa " toUpperCase " JAVA " strip "JAVA"
        if (upperString.strip().startsWith("JA") &&
                lowerString.trim().endsWith("er")) {
            System.out.println(upperString.replace("A", "!") +
                    lowerString.repeat(2));
        }


        // массивы из строк
        string01 = "java junior developer";
        String[] strings = string01.split(" ");
        System.out.println(Arrays.toString(strings));

        char[] chars = string01.toCharArray();
        System.out.println(Arrays.toString(chars));

        // длина строки
        System.out.println(string01.length());

        // конкатенация строк
        string01 = "Hello";
        string02 = "World";
        // оператор +
        String concat = string01 + " " + string02;
        concat = "Hello" + " " + "World";
        // метод concat
        concat = string01.concat(" ").concat(string02);

        // StringBuilder или StringBuffer (использовать для конкатенации в цикле)
        StringBuilder sb = new StringBuilder();
        sb.append(string01)
                .append(" ")
                .append(string02)
                .append("!!!");
        concat = sb.toString();
        System.out.println(concat);

        String reversed = sb.reverse()
                .delete(0, 3)
                .insert(1, "???")
                .toString();
        System.out.println(reversed);


        String[][] matrix01 = new String[3][3];
        // [[null, null, null], [null, null, null], [null, null, null]]
        String[][] matrix02 = {
                {"open", "close", "process"},
                {"close", "!!close!!", "process", "close"},
                {"process", "close", "close", "close", "process"}
        };
        System.out.println(matrix02[1][1]);
        System.out.println(Arrays.deepToString(matrix01));

        String[][] animals = new String[3][]; // [null, null, null]
        animals[0] = new String[2]; // [[null, null], null, null]
        animals[1] = new String[3]; // [[null, null], [null, null, null], null]
        animals[2] = new String[4]; // [[null, null], [null, null, null], [null, null, null, null]]

        // форматирование строк
        String item = "Книга";
        int count = 0;
        double rating = 5.5;
        // Товар: Книга. На складе: 0шт. Рейтинг: 5.5.
        // "Товар: + item + ". На складе: " + count + "шт.
        // Рейтинг: " + rating + "."
        // "Товар: {item}. На складе: {count}шт. Рейтинг: {rating}."
        String formattedString =
                MessageFormat.format("Товар: {0}. На складе: {1}шт. Рейтинг: {2}.",
                        item, count, rating);
        System.out.println(formattedString);

        MessageFormat messageFormat = new MessageFormat ("Т: {0}." +
                " Кол: {1, choice, 0#товар отсутствует|0<мало|5<много}. Р: {2}.", Locale.UK);
        formattedString = messageFormat.format(new Object[]{item, count, rating});
        System.out.println(formattedString);

        // class MessageFormat
        // {index}
        // {index, type}
        // {index, type, style}
        // number:	integer, currency, percent, custom format - class DecimalFormat
        // date:	short, medium, long, full, custom format - class SimpleDateFormat
        // time:	short, medium, long, full, custom format - class SimpleDateFormat
        // choice:	custom format - class ChoiceFormat

        int number = 1;
        boolean answer = true;
        double value = 5.77233;
        formattedString = String.format("%d) Верный ответ: %B", number, answer);
        System.out.println(formattedString);

        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formattedString = formatter.format("%d) Верный ответ: %B", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) Верный ответ: %2$b", number, answer).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = String.format("%d) Верный ответ: %B", number, answer);
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        formattedString = formatter.format("%1$d) Верный ответ: %2$.2f", number, value).toString();
        System.out.println(formattedString);
        stringBuilder.setLength(0);

        // %[argument_index$][flags][width][.precision]conversion
        // % и conversion являются обязательными
        // conversion указывает на то, как должен быть отформатирован аргумент.
        // b или B – для логических значений
        // s или S — для строк (String)
        // c или C - для символов
        // d - для десятичного числа
        // o - для восьмеричного числа
        // x или X - для шестнадцатеричного числа
        // f - для чисел с плавающей точкой
        // t или T - дата и время
        // argument_index$ - целое число, аргумент из списка
        // flags - набор символов, используемых для изменения формата вывода.
        // width — положительное целое число, минимальное количество символов, которое должно быть записано в вывод.
        // precision - целое число, используется для ограничения количества символов.
        // Количество цифр после запятой для float и double

    }
}