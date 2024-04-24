package com.lidiya.project.lesson22.lessontask;

public class NutritionFacts {
    private final String name;
    private final int calories;
    private final int fat;
    private final int servings;

    private NutritionFacts(Builder builder) {
        name = builder.name;
        calories = builder.cal;
        fat = builder.f;
        servings = builder.ser;
    }

    public static class Builder {
        private final String name;
        private int cal = -1;
        private int f = -1;
        private int ser = -1;

        public Builder(String name) {
            this.name = name;
        }

        public Builder calories(int calories) {
            cal = calories;
            return this;
        }

        public Builder fat(int fat) {
            f = fat;
            return this;
        }

        public Builder servings(int servings) {
            ser = servings;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
}

