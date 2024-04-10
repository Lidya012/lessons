package com.lidiya.project.lesson1920;

import com.lidiya.project.lesson09.Car;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class lesson19StreamAPI {
    public static void main(String[] args) {
/*
        Stream API - предоставляет набор методов для работы с данными, как с потоком.
        Позволяет представить различные наборы данных в виде потока,
        а далее: сортировать их, фильтровать, осуществлять поиск по различным критериям и т.д.,
                 кроме этого позволяет создавать коллекции и мапы из текущего потока данных.

        Особенности работы со Stream API:
         1. Stream никогда НЕ ХРАНИТ ДАННЫЕ
         2. Для сохранения данных из Stream нужно использовать специальные методы.
         3. Stream никогда НЕ ИЗМЕНЯЕТ ИСТОЧНИК (коллекцию, массив и тд), из которого он создан,
            все преобразования происходят только в потоках.
         4. В своей работе методы stream используют лямбда выражения.

        Для работы с потоками данных необходимо:
         1. Получить данные в виде потока - объект типа Stream
         2. Выполнить промежуточные операции с потоком данных
            (промежуточные операции обрабатывают данные и возвращают Stream объект)
         3. Выполнить терминальную (конечную) операцию
            (терминальная операция обрабатывает данные и завершает работу потока)
         Без терминальной операции промежуточные операции не начнут выполняться

         Например, получили объект stream, далее выполняем промежуточные операции
         stream.операция1() - вернет преобразованный объект stream
                .операция2() - вернет преобразованный объект stream
                .операция3()  - вернет преобразованный объект stream
                .терминальнаяОперация(); - запускает промежуточные операции, данные обрабатываются, стрим закрывается

         Методы получения Stream:
          1. из коллекций `collection.stream();`
          2. из массива `Arrays.stream(arr);`
          3. из файла `Files.lines(path_to_file);`
          4. из строки `string.chars();`
          5. используя builder `Stream.builder().add(obj1).add(obj2).add(objN).build();`
          6. из набора данных `Stream.of(1, 4, 7);`

        Числовые потоки содержат дополнительные методы для работы с числами:
         1. IntStream intStream = IntStream.range(12, 100);
         2. LongStream longStream = LongStream.builder().add(2).add(23).add(11).build();
         3. DoubleStream doubleStream = DoubleStream.of(2.5, 12,8);
         */

        // Дан поток целых чисел:
        Stream<Integer> temps =
                Stream.of(-560, 312, 12, -55, -100, 45, 0, 0, 23, -20, 221);
        // - оставить в потоке только отрицательные элементы - filter(Predicate)
        // - добавить к каждому элементу строку " deg" - map(Function)
        // - вывести каждый элемент в консоль - forEach(Consumer)
        // boolean test(T t);
        Predicate<Integer> isNeg = x -> x < 0;
        temps.filter(isNeg)
                .map(integer -> integer + " deg")
                .forEach(s -> System.out.println(s));

        // Дан поток целых чисел:
        Stream<Integer> values = Stream.of(-560, 312, 12,
                -55, -100, 45, 0, 0, 23, -20, 221);
        // - оставить только уникальные значения - distinct()
        // - отрицательные значения заменить на 0 - map(Function)
        // - отсортировать в порядке убывания - sorted(Comparator)
        // - вывести элементы в консоль - forEach(Consumer)
        values.distinct()
                .map(value -> value < 0 ? 0 : value)
                /*.map(value -> {
                    if (value < 0) return 0;
                    return value;
                })*/
                .sorted((value1, value2) -> value2 - value1)
                .forEach(value -> System.out.println(value));

        // sorted() сортировка в натуральном порядке,
        // определенном интерфейсом Comparable


        // Дан массив строк:
        String[] colors = {"white", "black", "red", "yellow", "yellowgreen", "green", "dark yellow"};
        // - создать строк - Arrays.stream(colors)
        // - оставить цвета, не содержащие жёлтый (yellow) оттенок - filter(Predicate p)
        // - вывести в консоль количество элементов потока - long count()
        long count = Arrays.stream(colors)
                .filter(color -> !color.contains("yellow"))
                .count();

    }

    }
