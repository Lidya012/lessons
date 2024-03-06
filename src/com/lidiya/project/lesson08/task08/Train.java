package com.lidiya.project.lesson08.task08;

public class Train extends  Vehicle{
    private  int numberOfVagons;
    private  boolean climateControl;

    public Train(int number, int wearlevel, int numberOfVagons, boolean climateControl){
        super (number, wearlevel);
         this.climateControl = climateControl;
    }

    @Override
    public void repair() {
        if (getWearlevel() >0) {
            if (numberOfVagons>7)
                setWearlevel(getWearlevel()-1);
            else setWearlevel(getWearlevel()-2);
        }
    }
}
