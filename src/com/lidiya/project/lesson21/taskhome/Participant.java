package com.lidiya.project.lesson21.taskhome;

public class Participant {
    private int id;
    private String name;
    // доступен в данный момент
    private boolean active;
    // опыт
    private int experience;
    // максимальное количество задач, которые может выполнить
    private int maxTasks;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public int getExperience() {
        return experience;
    }

    public int getMaxTasks() {
        return maxTasks;
    }
// геттеры, сеттеры и д.т

}
