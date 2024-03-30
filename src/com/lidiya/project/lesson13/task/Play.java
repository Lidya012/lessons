package com.lidiya.project.lesson13.task;

public class Play extends Action{
    @Override
    public void execute() {
        System.out.println("eat");
    }

    void nextAction(Action action) {
        super.nextAction(action);
    }



}

