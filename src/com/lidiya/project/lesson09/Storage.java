package com.lidiya.project.lesson09;

public class Storage {
    public final String title;
    public final Apple apple =new Apple();
    public final  Apple[] apples = new Apple[10];

    public Storage(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}

