package com.lidiya.project.lesson11;

import java.util.Arrays;
import java.util.Objects;

public class Figure {
    private Point[] points ;

    public Figure(int numberOfPoints) {
        if (numberOfPoints < 2)
            throw new IllegalArgumentException();
        points = new Point[numberOfPoints];
    }
    public void addPoint(Point point){
        point = Objects.requireNonNull(point,
                "point не может быть null");
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                points[i] = point;
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Arrays.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(points);
    }
    @Override
    public Figure clone(){
            Figure figure = new Figure(points.length);
            for (int i = 0; i < points.length; i++) {
                figure.points[i] = points[i].clone();
            }
            return figure;
        }
}

