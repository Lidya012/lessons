package com.lidiya.project.lesson21.taskhome;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.filtering;

public class TaskTracker {
    private String name;
    private Set<TaskToParticipant> tasks;

    // taskPredicates - условия добавления задач. Тип данных определить самостоятельно
    // условие добавление задачи по умолчанию: задача должна быть открытой
    // может быть заменено методом taskSettings
    private ArrayList<TaskPredicate> taskPredicates;

    // participantPredicates - условия добавления исполнителей. Тип данных определить самостоятельно
    // условие добавление исполнителя по умолчанию: исполнитель должен быть
    // доступен по свойству active
    // может быть заменено методом participantSettings
    private ArrayList<ParticipantPredicate> participantPredicates;


    // конструктор не должен быть доступен вне класса
    // создание TaskTracker происходит вызовом статического метода withTitle,
    // метод принимает на вход название создает и возвращает экземпляр TaskTracker
    private TaskTracker() {}
    public static TaskTracker withTitle (String name){
        if (name == null) throw new IllegalArgumentException("Параметр имя не может быть null");
        TaskTracker taskTracker = new TaskTracker();
        taskTracker.name = name;
        return taskTracker;
    }


    // TaskPredicate - функциональный интерфейс -
    // его абстрактный метод принимает задачу, возвращает ture или false
    public TaskTracker taskSettings(TaskPredicate... predicates) {
        // predicates - массив типа TaskPredicate -
        // условия добавления задач,
        // например, predicates - задача должна быть срочной
        //                      - задача должна быть новой
        //                      - задача должна быть просроченной
        // все условия хранятся в TaskPredicate
        return this;
    }


    // ParticipantPredicate - функциональный интерфейс -
    // его абстрактный метод принимает задачу, возвращает ture или false
    public TaskTracker participantSettings(ParticipantPredicate... predicates) {
        // predicates - массив типа ParticipantPredicate -
        // условия добавления исполнителей
        // например, predicates - опыт работы выше 5
        //                      - исполнитель должен быть доступен
        //                      - у исполнителя еще нет задач
        // все условия хранятся в participantPredicates
        return this;
    }

    public TaskTracker add(Task task, Participant participant) {
        // создается TaskToParticipant, если задача (task) и исполнитель (participant)
        // удовлетворяют требованиям taskPredicates и participantPredicates
        // TaskToParticipant добавляется в tasks
        TaskTracker taskTracker = new TaskTracker();
        TaskToParticipant taskToParticipant = new TaskToParticipant();
        taskToParticipant.setTask(task);
        taskToParticipant.setParticipant(participant);
        taskToParticipant.setProgress((int) Math.random() * 100);
        taskTracker.tasks.add(taskToParticipant);

        return this;
    }
    // возвращает статистику по текущему состоянию трекера
    public TasksTrackerStatistic getStatistics() {
        // реализовать метод, используя collectors api
        // посмотрите методы teeing() и reducing()
        return null;
    }

    // возвращает Map,
    // где ключи - идентификаторы исполнителей
    // значения - все его открытые задачи
    public Map<Integer, List<Task>> groupTasksByParticipantId() {
        return tasks.stream().collect(Collectors.groupingBy(tasks -> tasks.getParticipant().getId(),
                Collectors.filtering(tasks -> tasks.getTask().getStatus() != Task.Status.CLOSED,
                        Collectors.mapping(tasks -> tasks.getTask(), Collectors.toList()))));
    }

    // возвращает Map,
    // где ключи - статус задачи
    // значения - Map,
    //      где ключи - статусы задач,
    //      значения - списки идентификаторов задач
    public Map<Task.Status, Map<Task.Priority, List<Integer>>>
    groupTasksIdByStatusAndPriority() {
        return null;
    }

    // возвращает неизменяемый список задач, прошедших проверку predicate
    public List<Task> filteredTasks(TaskPredicate predicate) {
        return null;
    }
}

