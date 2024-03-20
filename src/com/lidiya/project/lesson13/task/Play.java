package com.lidiya.project.lesson13.task;

public class Play implements Action{
    @Override
    public void execute() {
        System.out.print("eat ");
    }

    @Override
    public void nextAction() {
        execute();
    }
}

