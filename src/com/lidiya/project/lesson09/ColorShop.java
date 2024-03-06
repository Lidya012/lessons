package com.lidiya.project.lesson09;

public class ColorShop {
    private Colorable[] colorables;
    private String[] colors;
    public void  changeColor(){
        for (Colorable colorable: colorables){
            colorable.color(colors[0]);
        }

    }
}
