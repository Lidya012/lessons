package com.lidiya.project.lesson07.task07;

public class task07 {
    public static void main(String[] args) {
        String nameproduct = "cheese";
        double proteinCheese = 2.5;
        double fatsCheese = 3.2;
        double carbohydratesCheese = 1.1;
        int caloriesCheese = 45;

        Product cheese = new Product(nameproduct, proteinCheese, fatsCheese, caloriesCheese, caloriesCheese);
        PermittedProducts calculation = new PermittedProducts();
        boolean cheakcheese = calculation.checkProduct(cheese);
        System.out.println("Максимальное значение белков " + calculation.getMax_proteins());
        System.out.println("Максимальное значение жиров " + calculation.getMax_fats());
        System.out.println("Максимальное значение углеводов " + calculation.getMax_carbohydrates());
        System.out.println("Максимальное значение калорий " + calculation.getMax_calories());
        if (!cheakcheese)
            System.out.println("Продукт не подходит");
        else System.out.println("Продукт подходит");
    }
}
