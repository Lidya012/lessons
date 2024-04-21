package com.lidiya.project.lesson21;





import com.lidiya.project.lesson14.Car;
import com.lidiya.project.lesson14.Train;
import com.lidiya.project.lesson14.Vehicle;

import java.util.TreeMap;
// интерфейс без методов - интерфейс маркер
interface A { }
// функциональный интерфейс -
// один абстрактный метод
interface B {
    Vehicle bVoid(String string);
}
interface C {
    Car cVoidCar(String string);
    Train cVoidTrain(String string);
}

public class interfaces {
    public static void main(String[] args) {
        C c = new C() { // implements C
            @Override
            public Car cVoidCar(String string) {
                return null;
            }

            @Override
            public Train cVoidTrain(String string) {
                return null;
            }
        };
        c.cVoidCar("");
        c.cVoidTrain("");
    }
}