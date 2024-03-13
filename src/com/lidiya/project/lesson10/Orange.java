package com.lidiya.project.lesson10;

public class Orange {
    private static Orange orange;
    private boolean isFresh;
    private int price;

    public static Orange getOrange(boolean isFresh, int price){
        if (orange == null) orange = new Orange(isFresh, price);
        return orange;
    }

    private Orange(boolean isFresh, int price) {
        this.isFresh = isFresh;
        this.price = price;
    }

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
