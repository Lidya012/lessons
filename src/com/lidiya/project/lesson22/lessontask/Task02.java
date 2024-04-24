package com.lidiya.project.lesson22.lessontask;

public class Task02 {
    public static void main(String[] args) {
        // Датчик может информировать о
        // повышении или понижении температуры
        // Когда в датчике меняется температура (Math.random())
        // экземпляры red, yellow и green реагируют
        // на данные изменения, каждый своим способом (sout)

        // red начинает реагировать на повышении температуры,
        // начиная с 300С, далее каждые 50С

        // yellow начинает реагировать на повышении температуры,
        // начиная с 200С, далее каждые 30С

        // green начинает реагировать на повышении температуры,
        // начиная с 100С, далее каждые 10С

        // Sensor creation
        Reactionable red = new Reactionable() {
            int countReaction = 0;
            double changeTemperature = 0;
            @Override
            public void react(double value) {
                if (value >= 300){
                    countReaction++;
                    countReaction = (int) (countReaction + (value - 300) / 50);
                    changeTemperature = value;
                }
            }
            @Override
            public void log() {
                System.out.println("red среагировал " + countReaction + " раз. Температура повысилась на " + changeTemperature);
            }
        };
        Reactionable yellow = new Reactionable() {
            int countReaction = 0;
            double changeTemperature = 0;
            @Override
            public void react(double value) {
                if (value >= 200){
                    countReaction++;
                    countReaction = (int) (countReaction + (value - 200) / 30);
                    changeTemperature = value;
                }
            }
            @Override
            public void log() {
                System.out.println("yellow среагировал " + countReaction + " раз. Температура повысилась на " + changeTemperature);
            }
        };
        Reactionable green = new Reactionable() {
            int countReaction = 0;
            double changeTemperature = 0;
            @Override
            public void react(double value) {
                if (value >= 100){
                    countReaction++;
                    countReaction = (int) (countReaction + (value - 100) / 10);
                    changeTemperature = value;
                }
            }
            @Override
            public void log() {
                System.out.println("green среагировал " + countReaction + " раз. Температура повысилась на " + changeTemperature);
            }
        };
        Sensor sensor = new Sensor();

        sensor.addReactionable(red);
        sensor.addReactionable(yellow);
        sensor.addReactionable(green);

        sensor.temperatureRequest();
        sensor.temperatureRequest();
        sensor.temperatureRequest();
    }
}

