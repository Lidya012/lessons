package com.lidiya.project.lesson10;

public class Box {
    private static int numberOfBoxes;
    private int height;
    private int width;
    private int length;



     public   Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void grow(int heightInc, int widthInc, int lengthInc){
        this.height += heightInc;
        this.width += widthInc;
        this.length += lengthInc;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public static void  incNumberOfBoxes(){
         numberOfBoxes += 1;
    }
    public static int getNumberOfBoxes(){
         return numberOfBoxes;
    }
public static Box init2Box(int value){
         return new Box(value*2, value*2, value*2);
}

    interface SomeInterface{
         String value ="Строка"; //свойство всегда public final static
         static void  printString(){
             System.out.println(value);
         }
    }
    abstract  class Unit{

    }

}
