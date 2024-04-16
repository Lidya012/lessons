package com.lidiya.project.lesson14;

public interface Repaintable { boolean changeColor(Color newColor);
    Color getColor();

    enum Color{
        RED("красный"), ORANGE("оранжевый"), BLACK("чёрный"), BLUE("синий"), GOLD("золотистый");
        private final String name;

        Color(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
