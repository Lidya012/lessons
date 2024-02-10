package lesson02;
//однострочный комментарий

/* многострочный
комментарий
 */

/**
 * документирование
 * кода
 **/
public class /*lesson02DataTypes*/ DataTypes {
    public static void main(String[] args) {

        //ctrl+ alt +L  - форматирование (запятые)
        System.out.println("Вывод данных в консоль");

//  Объявление переменных
//типДанных имяПеременной;
        int userArg;
        int width, height;

//        инициализация переменной
//        = это знак  присваивания
        userArg = 79;
        width = 100;
        height = 107;

//        переопределение значения
        userArg = 80;


// Инициализация в момент объявления
        int numberOfColor = 3;
        int numberOfFruits = 10, numberOfVegetables = 11;


//примитивные и ссылочные типы данных


//        Примитивные типы:
//     1. целочисленные:
//       1.1 byte (16байт -128 +127)
//       1.2 short (2байт -32768 +32767)
//       1.3 int (4байта)
//       1.4 long (8байт)
//     2. числа с плавающей точкой:
//        2.1 float(4байт) BigDecimal для вычислений
//        2.2 double(8байт) BigDecimal для вычислений
//     3. логический boolean
//        принимает 2 значения true или false
//     4. символьный тип char
//        0 - 65635/  '0' / 'u000'

        byte byteFromFile = 56;
        short numberOfLesson =150;
        long millis = 334, age = 8_000_000_000L;/*Для удобства через нижнее подчеркивание*/
        float temp = 38.85F; // или 35.85f
        double maxTemp = 335.88;


//объявление переменных через var(java 10)
// только локальные переменные методов
// необходимо инициализировать при объявлении
//  для определения типа даннх по значению
        var classVersion =10; // int
        var bigValue =10L; //long
        var count =(short) 358; //short
        var readByte = (byte) 100; //byte
        var balance = 100.5; // double
        var numberOfHours = 16.6F; // float
        var isActive =true; //boolean

//  в рамка{} нельзя объявить две переменные
// нельзя объявить несколько переменных
        // с одинаковым именем
        // в рамках одной область видимости (фигурные скобки)

        // арифметические операторы
        // +
        // "34" + "45" -> "3445"
        // 1 + 3 -> 4
        // -
        // 2 - 1 -> 1
        // -3
        // *
        // 4 * 0 -> 0
        // /
        // 50 / 0 -> ???
        // 50.0 / 0.0 -> ???
        // % --- ДЗ

int int01=10;
int zeroInt = 0;
System.out.println(int01 / zeroInt);
//целочисленное деление на 0 - исключение времени исполнения
//java.lang.ArithmeticException
//System.out.println(int01 / zeroInt);

        double double01 = -10.0;
        double zeroDouble = 0.0;
        // деление чисел с плавающей точкой на 0 - Infinity
        System.out.println(double01 / zeroDouble);

//результат целочисленного деления -целое число,остаток будет отброшен
        int num01 = 3;
        int num02 = 2;
        int result = num01 / num02;

        // при необходимости сохранения остатка , один из операндов приводится в double или float

        double doubleResult = (double) num01 / num02;

//        результат арифметических операций с byte и short
//        всегда повышается до int
//        резултат вычислений всегда помышается до наибольшего оператора
//        byte - short - int - long - float - double


        // приведение типов
        // автоматическое
        byte byteValue = 1;
        int intValue = byteValue;
        // явное (тип)
        short shortValue = (short) intValue;
    }
}





/*JDK:
классы,
JavaVirtualMachine(GVM): нтерпритатор
компилятор, отладчик

JavaRanTimeEdition (JRE):
классы,
JavaVirtualMachine(GRM): нтерпритатор
 */

//исходный код в файлах src --- .java
//  компилятор
// байткод в файлах  *.class
//итерпретатор
// выполнение инструкций