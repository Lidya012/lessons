package com.lidiya.project.lesson14;


    public class MiniCar extends Car implements Runnable{
        public MiniCar(Color color, String number) {
            super(color, number);
        }

        @Override
        public void run() {
            incLevelOfWare(1);
        }
    }
