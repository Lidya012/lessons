package com.lidiya.project.lesson13.task;

public class Drink implements Action{
    @Override
    public void execute() {
        System.out.print("drink ");
    }

    @Override
    public void nextAction() {
        execute();
        new Play().nextAction();
    }
}
