package com.lidiya.project.lesson1920;

import com.lidiya.project.lesson14.*;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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
        // Дан список Repaintable объектов
        List<Repaintable> repaintables = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new MiniCar(Repaintable.Color.BLACK, "002"),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Car(Repaintable.Color.RED, "004"),
                new MiniCar(Repaintable.Color.BLUE, "005"),
                new Car(Repaintable.Color.BLACK, "006"),
                new Car(Repaintable.Color.ORANGE, "007")
        );
        // получить список неповторяющихся цветов .toList()
        List<Repaintable.Color> uniqueColors = new ArrayList<>();
        repaintables.forEach(repaintable -> {
            if (!uniqueColors.contains(repaintable.getColor())) {
                uniqueColors.add(repaintable.getColor());
            }
        });

        List<Repaintable.Color> uniqueColorsFromStream = repaintables.stream()
                .map(repaintable -> repaintable.getColor())
                .distinct()
                .toList(); // unmodifiableList

        // Дан список транспортных средств
        List<Vehicle> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new Train("002", 10, true),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Bus("004"),
                new Train("005", 15, false),
                new Car(Repaintable.Color.BLACK, "006"),
                new MiniCar(Repaintable.Color.ORANGE, "007")
        );

        // 1. снизить уровень износа методом repair peek(Consumer)
        // 2. получить stream с уровнями износа транспортных средств
        // 3. вывести в консоль forEach(Consumer)
        vehicles.stream()
                //.peek(vehicle -> vehicle.repair())
                //.map(vehicle -> vehicle.getLevelOfWare())
                .map(vehicle -> {
                    vehicle.repair();
                    // return vehicle;
                    return vehicle.getLevelOfWare();
                })
                .forEach(integer -> System.out.println(integer));


        
        int sumLevelOfWare = vehicles.stream()
                .mapToInt(vehicle -> vehicle.getLevelOfWare())
                .sum();
        // vehicles.stream().findFirst(); // Optional<Vehicle>
        // vehicles.stream().findAny(); // Optional<Vehicle>

        // vehicles.parallelStream().findFirst();
        // vehicles.parallelStream().findAny();
        // 1 2 3 4 -> stream() 1 , 2 , 3 , 4
        // 1 2 3 4 -> parallelStream() 3, 1, 4, 2 ->

        // vehicles.stream().forEach();
        // vehicles.stream().forEachOrdered();

        // vehicles.parallelStream().forEach();
        // vehicles.parallelStream().forEachOrdered();

        // vehicles.stream()
        //   .min((o1, o2) -> o1.getLevelOfWare() - o2.getLevelOfWare()); // Optional<Vehicle>
        // vehicles.stream()
        //   .max((o1, o2) -> o1.getLevelOfWare() - o2.getLevelOfWare()); // Optional<Vehicle>

        // true / false
        // vehicles.stream()
        //   .allMatch(vehicle -> vehicle.getLevelOfWare() > 100);
        // vehicles.stream()
        //   .anyMatch(vehicle -> vehicle.getLevelOfWare() > 100);
        // vehicles.stream()
        //   .noneMatch(vehicle -> vehicle.getLevelOfWare() > 100);
//все методы терминальные
        // все промtжутлчные возращают stream


        List<List<Integer>> integers = new ArrayList<>();
        integers.add(List.of(3, 5, 8, 1, 9));
        integers.add(List.of(34, -5, 10, 56, 11));
        integers.add(List.of(90, 5, 22, -83, 27));

        List<Integer> intStream = integers.stream()
                .map(list -> list.stream().mapToInt(value -> value).sum())
                .toList();

        long sum01 = integers.stream()
                .mapToInt(list -> list.stream().mapToInt(value -> value).sum())
                .sum();

        long sum02 = integers.stream()
                // элементы вложенных stream останутся в своих вложенных stream
                // .map(list -> list.stream().mapToInt(value -> value))

                // элементы вложенных stream объединяет в общий stream
                .flatMapToInt(list -> list.stream().mapToInt(value -> value))
                .sum();


        // преобразование stream в массив
        Object[] objectsArr = vehicles.stream().toArray();
        Vehicle[] vehiclesArr = vehicles.stream()
                .toArray(Vehicle[]::new); // ссылка на конструктор массива типа Vehicle
        // IntFunction<A[]> generator R apply(int value);
        // .toArray(size -> new Vehicle[size]); без ссылки на конструктор

        // преобразование stream в список
        List<Vehicle> vehiclesList01 = vehicles.stream()
                .toList(); // unmodifiableList

        List<Vehicle> vehiclesList02 = vehicles.stream()
                .collect(Collectors.toList());// ???List

        List<Vehicle> vehiclesList03 = vehicles.stream()
                .collect(Collectors.toCollection(ArrayList::new)); // ArrayList

        String[] strings = {"white", "black", "red", "red", "yellow",
                "yellowgreen", "green", "dark yellow"};
        // Function<? super T, ? extends K> keyMapper,
        // Function<? super T, ? extends U> valueMapper,
        // BinaryOperator<U> mergeFunction
        Map<String, Integer> stringIntegerMap = Arrays.stream(strings)
                .collect(Collectors.toMap(
                        color -> color, // правила формирования ключей
                        color -> color.length(),// правила формирования значений
                        (value1, value2) -> value1 + value2// что делать со значениями, если сформированы одинаковые ключи
                ));

        Map<String, Integer> numberLevelOfWare = vehicles.stream()
                .collect(Collectors.toMap(
                        vehicle -> vehicle.getNumber(),
                        vehicle -> vehicle.getLevelOfWare(),
                        (value1, value2) -> value1
                ));


    }

    }
