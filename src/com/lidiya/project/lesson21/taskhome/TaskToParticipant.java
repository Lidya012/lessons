package com.lidiya.project.lesson21.taskhome;

public class TaskToParticipant {
    private Participant participant;
    private Task task;
    private int progress;


    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Participant getParticipant() {
        return participant;
    }

    public Task getTask() {
        return task;
    }

    public int getProgress() {
        return progress;
    }




}
