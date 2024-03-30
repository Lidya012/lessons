package com.lidiya.project.lesson13.task;

public class main {
    public static void main(String[] args) {
        Action action01 = new Eat();
        Action action02 = new Drink();
        Action action03 =new Play();



        action01.nextAction(action02);
        action02.nextAction(action03);

        Animal animal = new Animal();
        animal.doAction(action01); // eat drink play
    }
}
