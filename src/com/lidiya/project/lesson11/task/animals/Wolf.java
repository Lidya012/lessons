package com.lidiya.project.lesson11.task.animals;


import java.util.Arrays;
import java.util.Objects;

public class Wolf extends WildAnimal{
    private final String[] likeToEat;
    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wolf wolf = (Wolf) o;
        return Arrays.equals(likeToEat, wolf.likeToEat) && Objects.equals(color, wolf.color) &&
                Objects.equals(super.getStrength(), wolf.getStrength()) &&
                Objects.equals(super.getName(), wolf.getName()) &&
                Objects.equals(super.getAge(), wolf.getAge());
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(color);
        result = 31 * result + Arrays.hashCode(likeToEat);
        return result;
    }
}