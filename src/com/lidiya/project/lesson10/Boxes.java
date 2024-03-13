package com.lidiya.project.lesson10;

import java.util.Arrays;

public class Boxes {
    private Boxes(){}


    // public static Box[] boxes = new Box[1000];
    public static final int MAX_BOX_LENGTH = 900;
    public static final int MAX_BOX_WIDTH = 2000;
    public static final int MAX_BOX_HEIGHT = 1500;

    public static void halhBox(Box box){
        box.grow(-box.getHeight(), -box.getWidth(), box.getLength());
    }

    public static Box compareBoxesByLength(Box box01, Box box02){
        if (box01.getLength() > box02.getLength()) return box01;
        return box02;
    }
    // Box box = new Box(10, 7, 2);
// Boxes.halfBox(box);
// box.getLength();
}
