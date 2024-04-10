package com.lidiya.project.lesson18.task;

import com.lidiya.project.lesson09.Task;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class main {
    public static void main(String[] args) {


        task18 task01 = new task18(1, "Задача1", task18.Status.CLOSED,
                LocalDateTime.of(2023, 5, 28, 12, 30),
                LocalDateTime.of(2024, 1, 23, 14, 20));
        task18 task02 = new task18(2, "Задача2", task18.Status.NEW,
                LocalDateTime.of(2024, 3, 28, 12, 30),
                LocalDateTime.of(2024, 6, 23, 14, 20));
        task18 task03 = new task18(3, "Задача3", task18.Status.IN_PROGRESS,
                LocalDateTime.of(2023, 5, 28, 12, 30),
                LocalDateTime.of(2024, 12, 23, 14, 20));
        task18 task04 = new task18(4, "Задача4", task18.Status.CLOSED,
                LocalDateTime.of(2023, 5, 28, 12, 30),
                LocalDateTime.of(2024, 2, 15, 14, 20));


        List<task18> taskList = new ArrayList<>() {{

            add(task01);

            add(task02);

            add(task03);

            add(task04);
        }};

        System.out.println(taskList);

        // Задание №1
        // удалить задачи методом removeIf,
        // если они были созданы более месяца назад
        // и закрыты (статус CLOSED)
        System.out.println("Задание 1");
taskList.removeIf(element->{
            Period period =
                    Period.between(element.getCreatedAt().toLocalDate(),LocalDateTime.now().toLocalDate());
            return  element.getStatus() == task18.Status.CLOSED&& period.getMonths()>1;
        });
        System.out.println(taskList);

        // Задание №2
        // Перебрать список методом forEach,
        // вывести в консоль только открытые задачи,
        // которые нужно было завершить к текущему моменту
        System.out.println("Задание №2");
        taskList.forEach(element -> {
                    if (element == null) return;
                    if (element.getStatus() == task18.Status.IN_PROGRESS &&
                            element.getCloseTo().isBefore(LocalDateTime.now()))
                        System.out.println(element);
                }
        );

        // Задание №3
        // Перебрать список методом forEach,
        // вывести в консоль только задачи,
        // которые попадают в заданный диапазон дат
        System.out.println("Задание №3");
        taskList.forEach(element -> {
                    if (element == null) return;
                    LocalDateTime startDateTime = LocalDateTime.of(2023, 11, 1, 10, 0);
                    LocalDateTime endDateTime = LocalDateTime.of(2024, 2, 1, 10, 0);
                    if (element.getCreatedAt().isAfter(startDateTime) && element.getCloseTo().isBefore(endDateTime))
                        System.out.println(element);
                }
        );

        // Задание №4
        // Написать реализацию Function,
        // которая принимает на вход список задач,
        // и возвращает список с названиями
        // выполненных задач
        // в отсортированном по дате завершения виде
        System.out.println("Задание №4");
        Function<List<task18>, List<task18>> sortCompletedTasks = list -> {
            ArrayList<task18> sortedList = new ArrayList<>(list);
            sortedList.removeIf(element -> element.getStatus() != task18.Status.CLOSED);
            sortedList.sort((task1, task2) -> task1.getCloseTo().compareTo(task2.getCloseTo()));
            return sortedList;
        };
        System.out.println(sortCompletedTasks.apply(taskList));

    }
}