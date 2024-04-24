package com.lidiya.project.lesson22.lessontask;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Sensor {
    private double temperature;
    private List<Reactionable> reactionables = new ArrayList<>();

    public void addReactionable(Reactionable reactionable){
        reactionables.add(Objects.requireNonNull(reactionable));
    }
    public void removeReactionable(Reactionable reactionable){
        reactionables.remove(Objects.requireNonNull(reactionable));
    }

    public void temperatureRequest(){
        double temp = Math.random() * 1000;
        reactionables.forEach(reactionable -> {
            reactionable.react(temp);
            reactionable.log();
        });
    }
}