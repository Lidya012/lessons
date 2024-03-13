package com.lidiya.project.lesson09;

public class ColorEvent {
    private Colorable[] colorables;
    private final String[] colors = {"red", "white", "blue", "orange", "green"};

    public void changeColor() {
        for (int i = 0; i < colorables.length; i++) {
            if (colorables[i] == null) return;
            // для вызова доступны только методы Colorable
            colorables[i].color(colors[(int) (Math.random() * colors.length)]);
            colorables[i] = null;
        }
    }

    // можно передать массив объектов, принадлежащих типу Colorable
    public void setColorables(Colorable[] colorables){
        if (colorables == null) return;
        this.colorables = colorables;
    }
}