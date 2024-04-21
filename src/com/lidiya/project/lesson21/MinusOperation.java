package com.lidiya.project.lesson21;
import com.lidiya.project.lesson18.Operation;

public class MinusOperation implements Operation {
    @Override
    public double action(double a, double b) {
        return a - b;
    }
}
