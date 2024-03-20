package com.lidiya.project.lesson13.pwrappers;

import java.lang.ref.WeakReference;

public class PrimitiveWrappers {
    public static void main(String[] args) {
        Integer x = 9;
        Integer y = 9;

        System.out.println(x == y); // true
        System.out.println(x.equals(y)); // true

        Integer n = 900;
        Integer m = 900;
        System.out.println(n == m); // false
        System.out.println(n.equals(m)); // true


        Number number = 1000; // Integer
        //Double dNumber = (Double) number; // java.lang.ClassCastException
        // Long lNumber = (Long) number; // java.lang.ClassCastExceptio

        // public static Boolean getBoolean()
        boolean b = getBoolean();


        StringBuilder sb = new StringBuilder();

        WeakReference<StringBuilder> sbWeak =
                new WeakReference<>(sb);

        sb = null;

        // System.gc();
        // область Новые объекты
        // область Выжившие объекты
        // область Выжившие объекты
        // область Долгоживущие объекты
    }

    public static void v1(Integer i, double d) {
    }

    public static void v2(int[] ints) {
    }

    public static Boolean getBoolean() {
        return null;
    }
}
