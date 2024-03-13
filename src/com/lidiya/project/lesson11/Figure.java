package com.lidiya.project.lesson11;

import java.util.Objects;

public class Figure {
    private Point[] points;

    public Figure(int numberOfPoints) {
        if (numberOfPoints < 2)
            throw new IllegalArgumentException();
        points = new Point[numberOfPoints];

    }

    public void addPoint(Point point) {
        point = Objects.requireNonNull(point,
                "point не может быть null");
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                points[i] = point;
                return;
            }
        }
    }
}


