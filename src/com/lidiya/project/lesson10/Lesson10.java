package com.lidiya.project.lesson10;

public class Lesson10 {
    public static void main(String[] args) {
        Box box01 = Box.init2Box(3);
        Box box02 = new Box(30, 30, 30);
        Box box03 = new Box(100, 110, 120);

        box02.grow(2, 6, 9);
        box03.grow(10, 10, 10);

        // box01.incNumberOfBoxes();
        //  box01.incNumberOfBoxes();

        //System.out.println(box03.getNumberOfBoxes());
        Box.incNumberOfBoxes();
        ;
        Box.incNumberOfBoxes();
        Box.incNumberOfBoxes();
        System.out.println(Box.getNumberOfBoxes());

    }



}

