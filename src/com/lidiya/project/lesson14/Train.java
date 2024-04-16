package com.lidiya.project.lesson14;
public class Train extends Vehicle{
    private int carCount;
    private boolean isClimateControl;

    public Train(String number, int carCount, boolean isClimateControl) {
        super(number);
        this.carCount = carCount;
        this.isClimateControl = isClimateControl;
    }

    public void changeClimateControl(){
        isClimateControl = !isClimateControl;
    }

    public int getCarCount() {
        return carCount;
    }

    public boolean isClimateControl() {
        return isClimateControl;
    }


    @Override
    public void repair(){
        if (carCount < 7 && carCount > 0) if (levelOfWare >= 2) levelOfWare -= 2;
        super.repair();
    }

    @Override
    public void breakDown() {
        this.incLevelOfWare(2);
        if (carCount > 0) carCount -= 1;
    }
}
