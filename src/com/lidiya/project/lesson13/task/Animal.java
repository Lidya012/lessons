package com.lidiya.project.lesson13.task;

public class Animal {
    void doAction(Action action) {
        action.executeNext(this);
    }
}
