package com.lidiya.project.lesson11;

// (int x, int y) - заголовок записи (header)
// int x, int y - список компонентов заголовка
public record PointRecord(int x, int y) {
    // тело
    // нельзя объявлять не static поля
    // можно объявлять любые методы
    // можно переопределить геттеры

    // компактный конструктор
    public PointRecord /*(int x, int y)*/{
        if (x < 0 || y < 0)
            throw new IllegalArgumentException();
        // инициализация происходит по умолчанию
    }
}
// класс + геттеры
// класс + IDEA
// класс + lombok
// класс -> record
// private final поля - названия и типы, как у компонентов заголовка
// канонический (canonical) конструктор - принимает на вход
// и инициализирует значение всех свойств
// одноименные со свойствами геттеры int x(){} / int y(){}
// toString, equals, hashCode с участием всех свойств