package com.lidiya.project.lesson14;

import java.time.LocalDate;
import java.time.temporal.Temporal;

public class GenericMethods {
    public static void main(String[] args) {
        // Generic типы существуют только на этапе компиляции,
        // во время выполнения программы их не существует.
        // Generic компилируются в определенные типы

        // Стирание типов:
        // 1. Generic без ограничений компилируются в Object
        // 2. Generic c ограничениями компилируются в тип ограничения

        // Типизированные (generic) методы
        // могут принимать на вход и возвращать generic типы

        String[] strings = {"cat", "dog", "mouse"};
        String string = "cat";

        Integer[] integers = {34, 55, 90};
        Integer integer = 34;

        // <String> указывает на то, что в метод можно передать
        // строку и ее подтипы (но не супертипы)
        boolean result = GenericMethods.<String>inArray(strings, string);
        // <Number> указывает на то, что в метод можно передать
        // тип Number и его подтипы (но не супертипы)
        result = GenericMethods.<Number>inArray(integers, integer);
        result = GenericMethods.inArray(integers, integer);

        LocalDate localDate = LocalDate.now();

        int compareResult = GenericMethods.
                <Number, LocalDate>compareHashCodes(integer, localDate);

    }

    // generic без ограничений (unbounded)
    public static <T> boolean inArray(T[] arr, T elem){
        if (arr == null || elem == null) return false;
        for (T arrElement : arr) {
            if (arrElement != null && arrElement.equals(elem))
                return true;
        }
        return false;
    }

    // generic с ограничениями (bounded)
    // T - компилируется в Number
    // K - компилируется в Temporal
    public static <T extends Number, K extends Temporal>
    int compareHashCodes(T first, K second){
        // у first можно вызвать методы Number и его супертипов
        // у second можно вызвать методы Temporal и его супертипов
        return Integer.compare(first.hashCode(), second.hashCode());
    }

    public static void objectVoid(Object object){
    }
    }
