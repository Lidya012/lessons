package com.lidiya.project.lesson13.task;

public class Drink extends Action {
    @Override
    public void execute() {
        System.out.println("drink");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }



}
