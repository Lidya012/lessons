package com.lidiya.project.lesson21;


import com.lidiya.project.lesson14.*;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsApi21 {
    public static void main(String[] args) {


        List<Vehicle> vehicles = List.of(
                new Car(Repaintable.Color.GOLD, "001"),
                new Train("002", 10, true),
                new MiniCar(Repaintable.Color.ORANGE, "003"),
                new Bus("004"),
                new Train("005", 15, false),
                new Car(Repaintable.Color.BLACK, "006"),
                new MiniCar(Repaintable.Color.ORANGE, "007")
        );

        // Метод stream.collect (терминальная операция) чаще всего принимает экземпляр Collector
        // Экземпляры Collector создаются одним из статических методов Collectors класса
        // создание списка
        List<Vehicle> vehiclesList = vehicles.stream()/**/.collect(Collectors.toList());

        // создание множества
        Set<Vehicle> vehiclesSet = vehicles.stream()/**/.collect(Collectors.toSet());

        // есть возможность создавать неизменяемые списки и множества
        vehiclesList = vehicles.stream().collect(Collectors.toUnmodifiableList());
        vehiclesSet = vehicles.stream().collect(Collectors.toUnmodifiableSet());

        // создание конкретной реализации
        ArrayList<Vehicle> vehiclesArrayList = vehicles.stream()/**/
                .collect(Collectors.toCollection(ArrayList::new)); // T get();
        // или .collect(Collectors.toCollection(() -> new ArrayList<>())); // T get();

        // TreeSet<Vehicle> vehiclesTreeSet = vehicles.stream()/**/
        // .collect(Collectors.toCollection(TreeSet::new));

        String[] colors = {"white", "black", "red", "yellow",
                "yellowgreen", "green", "yellow", "dark yellow"};

        // создание мапы
        Map<String, Integer> map = Arrays.stream(colors)
                .collect(Collectors.toMap(
                        color -> color, // R apply(T t);
                        color -> color.length(), // R apply(T t);
                        (value1, value2) -> value1 + value2 //  T apply(T t1, T t2);
                ));
        Map<String, Integer> vehiclesMap = vehicles.stream()
                .collect(Collectors.toMap(
                        vehicle -> vehicle.getNumber(), // R apply(T t);
                        vehicle -> vehicle.getLevelOfWare() // R apply(T t);
                ));

        // или неизменяемой мапы
        map = Arrays.stream(colors)
                .collect(Collectors.toUnmodifiableMap(
                        color -> color,
                        String::length,
                        (value1, value2) -> value1 + value2
                ));
        // или потокобезопасной мапы
        map = Arrays.stream(colors)
                .collect(Collectors.toConcurrentMap(
                        color -> color,
                        String::length,
                        (value1, value2) -> value1 + value2
                ));

        // объединение в мапу по определенным характеристикам
        // Function<? super T, ? extends K> classifier
        // classifier описывает правила формирования ключа в мапе для элемента потока
        // (vehicle) -> vehicle.getLevelOfWare()
        Map<Integer, ArrayList<Vehicle>> vehiclesByLevelOfWare = vehicles.stream()
                .collect(Collectors.groupingBy(vehicle -> vehicle.getLevelOfWare()
                        , Collectors.toCollection(ArrayList::new)
                ));


        Map<Integer, List<String>> numbersByLevelOfWare = vehicles.stream()
                .collect(Collectors.groupingBy(
                        vehicle -> vehicle.getLevelOfWare(),
                        // формирует коллекцию объектов String типа из объектов Vehicle типа
                        Collectors.mapping(vehicle -> vehicle.getNumber(), Collectors.toList())
                ));


        Map<Integer, Long> map04 = vehicles.stream()
                .collect(Collectors.groupingBy(
                        vehicle -> vehicle.getLevelOfWare(), // если уровень износа одинаковый
                        Collectors.counting())); // суммирует значения

        Map<Integer, List<String>> map05 = vehicles.stream()
                .collect(Collectors.groupingBy(vehicle -> vehicle.getLevelOfWare(),
                        Collectors.filtering(vehicle -> vehicle.getLevelOfWare() > 5,
                                Collectors.mapping(vehicle -> vehicle.getNumber(), Collectors.toList()))));

        Map<Integer, List<String>> map06 = vehicles.stream()
                .filter(vehicle -> vehicle.getLevelOfWare() > 5)
                .collect(Collectors.groupingBy(vehicle -> vehicle.getLevelOfWare(),
                        // Collectors.filtering(vehicle -> vehicle.getLevelOfWare() > 5,
                        Collectors.mapping(vehicle -> vehicle.getNumber(), Collectors.toList())));


        // Collectors
        // reducing()
        // minBy() maxBy()
        // teeing() flatMapping() joining()
        // summingInt()
        // averagingInt() / averagingLong() / averagingDouble()
        // summarizingDouble() / summarizingInt() / summarizingLong()


    }
}
