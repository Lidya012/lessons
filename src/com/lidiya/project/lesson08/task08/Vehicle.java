package com.lidiya.project.lesson08.task08;

public class Vehicle {
    private int number;
    private int wearlevel;
    private int maxspeed = 120;

 public Vehicle(int number, int wearlevel){
     if(number <= 0) throw new IllegalArgumentException("Номер не может быть меньше либо равен нулю");
     if (wearlevel <= 0 ) throw new IllegalArgumentException("Износ не может быть меньше либо равен нулю");
     this.number =number;
     this.wearlevel = wearlevel;
 }

    public int getWearlevel() {
        return wearlevel;
    }
    public void setWearlevel(int wearlevel) {
        this.wearlevel = wearlevel;
    }
    public  void repair(){
        if(wearlevel > 0)
            wearlevel--;
    }

}
