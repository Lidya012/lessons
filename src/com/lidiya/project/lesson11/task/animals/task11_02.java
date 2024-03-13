package com.lidiya.project.lesson11.task.animals;

public class task11_02 {
    public static void main(String[] args) {


    Wolf wolf1 = new Wolf(new String[]{"beef", "rabbit", "chicken"}, "black");
    Wolf wolf2 = new Wolf(new String[]{"pork", "rabbit", "bird"}, "gray");
    Wolf wolf3 = new Wolf(new String[]{"pork", "rabbit", "bird"}, "gray");


    System.out.println(wolf1.equals(wolf2));
        System.out.println(wolf2.equals(wolf3));
        System.out.println(wolf3.equals(wolf1));
}
}

