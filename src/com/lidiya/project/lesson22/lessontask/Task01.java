package com.lidiya.project.lesson22.lessontask;

public class Task01 {
    public static void main(String[] args) {

        // NutritionFacts milk = new NutritionFacts("молоко");
        // milk.setFat(10);
        NutritionFacts milk = new NutritionFacts.Builder("молоко")
                .fat(10) // жирность
                .calories(30)
                .build(); // создает и возвращает NutritionFacts

        // NutritionFacts meat = new NutritionFacts("мясо");
        // meat.setCalories(300);
        // meat.setServings(200);
        // meat.setFat(80);
        NutritionFacts meat = new NutritionFacts.Builder("мясо")
                .calories(300) // калории
                .servings(200) // порции
                .fat(80) // жирность
                .build(); // создает и возвращает NutritionFacts
    }
}
