package com.lidiya.project.lesson18;

import java.util.function.Function;
import java.util.function.Predicate;;

public class Lesson18 {
    public static void main(String[] args) {
        Operation plus =(first, second) -> first+second;
        plus.action(7, 8.6);
        Operation plus02 =(first, second)-> {
            System.out.println(first + second);
            return first + second;
        };
        Operation minus =(first, second) -> first-second;
        System.out.println(minus.action(10, 6));

        int price =80;
        // написать реализацию Function, которая принимает
        // на вход целое число
        // и возвращает строку: переданное число руб.
Function<Integer, String> IntToStr = integer -> integer + " руб.";

        System.out.println(IntToStr);
        System.out.println(IntToStr.apply(price));

        // написать реализацию Predicate, которая принимает
        // на вход целое число
        // и возвращает true, если число положительное,
        // в остальных случаях - false
       price =100;
        Predicate<Integer> isPositive = x -> x > 0;
        Predicate<Integer> isNegative = x -> x < 0;
        Predicate<Integer> isZero = x -> x == 0;
        Predicate<Integer> predicate = isNegative.or(isZero);


        if (predicate.test(100)) {
        }




    }
    }


