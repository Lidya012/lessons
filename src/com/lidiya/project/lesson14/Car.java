package com.lidiya.project.lesson14;

    public class Car extends Vehicle implements Repaintable{
        private Color color;
        public Car(Color color, String number) {
            super(number);
            this.color = color;
        }

        public Color getColor() {
            return color;
        }


        @Override
        public boolean changeColor(Color newColor) {
            if (newColor == null || newColor == color) {
                return false;
            }
            color = newColor;
            return true;
        }

        @Override
        public void breakDown() {
            incLevelOfWare(levelOfWare * 2);
        }
    }

