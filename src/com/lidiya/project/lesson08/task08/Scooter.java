package com.lidiya.project.lesson08.task08;

public class Scooter extends Bicycle {
    private boolean isElectrical;

    public Scooter(int number, int wearlevel, boolean isElectrical) {
        super(number, wearlevel);
        this.isElectrical = isElectrical;
    }

    @Override
    public void repair() {
        if (getWearlevel() > 0) {
            if (isElectrical)
                setWearlevel(getWearlevel() - 2);
            else
                setWearlevel(getWearlevel() - 3);
        }
    }
}

