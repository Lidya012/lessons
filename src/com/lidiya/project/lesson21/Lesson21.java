package com.lidiya.project.lesson21;
import com.lidiya.project.lesson18.Operation;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

class HelpClass {
    public double minus(double a, double b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a * b;
    }
}


public class Lesson21 {

    public static void main(String[] args) {
        Operation plus = (a, b) -> a + b;
        Operation plusWithRef = Double::sum;
        Operation sub = (x, y) -> x * y;
        Operation subRef = HelpClass::sub;
        Operation minus = (a, b) -> a - b;
        // ссылка на не static метод предполагает наличие экземпляра
        // Operation minusRef = HelpClass::minus;
        Operation minusRef = new HelpClass()::minus;


        Calculator c01 = new Calculator();
        c01.calculate(34, 90);
        Calculator c02 = new Calculator((a, b) -> a - b);
        c02.calculate(34, 90);
        // (a, b) -> a - b
        /*
        public class MinusOperation implements Operation {
            @Override
            public double action(double a, double b) {
                return a - b;
            }
        }
        */
        Operation minusOperation = new MinusOperation();
        Calculator c03 = new Calculator(minusOperation);
        c03.calculate(34, 90);


        List<String> strings = Stream.of("dfqqe", "mfoqgmh", "fhmqu7yf")
//                .map(string -> string.toUpperCase());
//                .map(string -> {
//                   if (string != null) return string.toUpperCase();
//                   return "EMPTY";
//                });
                .map(String::toUpperCase)
                .toList();
    }


    public int someVoid01(String param01, String[] param02) {
        Optional<String> stringOptional = Optional.ofNullable(param01);
        Optional<String[]> stringArrOptional = Optional.ofNullable(param02);
        if (stringOptional.isPresent() && stringArrOptional.isPresent()) {
            return 1;
        }
        return 0;
    }

    public int someVoid02(String param01, String[] param02) {
        // Optional.of(param01);
        Objects.requireNonNull(param01);
        // Optional.of(param02);
        Objects.requireNonNull(param02);
        return 1;
    }

    public int someVoid03(String param01, String[] param02) {
        Optional<String> s = Optional.of(param01)
                .filter(param -> !param.isEmpty())
                .map(param -> param.toUpperCase());
        if (s.isEmpty()) return -1;
        return 1;
    }
}
