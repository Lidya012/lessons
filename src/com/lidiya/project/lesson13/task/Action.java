package com.lidiya.project.lesson13.task;

public abstract  class Action {
    private Action next;
    abstract protected void execute();

    void nextAction(Action next) {
        this.next = next;
    }
    public void executeNext(Animal animal) {
        execute();
        if (next != null) {
            animal.doAction(next);
        }

    }
};


