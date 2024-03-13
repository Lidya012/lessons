package com.lidiya.project.lesson11;

public enum Planets {
    SATURN("Saturn", 565465334, 564431186),
    NEPTUN("Neptun", 114214531,241234),
    MERCURY("Mercury",231015234 ,465344541);

    Planets(String name,long weight, long radius) {
        this.weight = weight;
        this.radius = radius;
        this.name = name;
    }

    private long weight;
    private  long radius;
    private String name;

    public long getWeight() {
        return weight;
    }

    public long getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }
}
