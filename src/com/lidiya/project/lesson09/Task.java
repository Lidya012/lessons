package com.lidiya.project.lesson09;

import java.util.Arrays;
public class Task {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Storage storage = new Storage( "Яблочный склад");
        System.out.println(storage.getTitle());

    storage.apples[0].setColor(("yellow"));
    storage.apples[1]= apple;
    storage.apple.setColor("white");
    }
}
