package com.lidiya.project.lesson09;

public class Apple {
    private String color;

    public String getColor() {
        return color;
    }

    public  void addApple(final Apple apple){
        final  int a = 90;
        apple.setColor("green");

    }
    public void setColor(String color) {
        this.color = color;
    }
}
