package com.lidiya.project.lesson09;
import java.io.Serializable;
import java.util.Arrays;

// класс может реализовывать несколько интерфейсов,
// реализуя все их абстрактные методы
public class Building implements Colorable, Serializable {
    private String[] colors = new String[5];

    @Override
    public void color(String color) {
        if (color == null) return;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == null || colors[i].equals(color)) {
                colors[i] = color;
                return;
            }
        }
    }

    @Override
    public void setDefaultColor() {
        Arrays.fill(colors,null);
    }

    @Override
    public void run() {
        System.out.println("здание строится");
    }
}
