package com.lidiya.project.lesson13.task;

public class main {
    public static void main(String[] args) {
        Action action01 = new Eat();
        Action action02 = new Drink();
        Action action03 =new Play();

        Animal animal = new Animal();

        animal.doAction(action01);
        System.out.println();
        animal.doAction(action02);
        System.out.println();
        animal.doAction(action03);

    }
}
