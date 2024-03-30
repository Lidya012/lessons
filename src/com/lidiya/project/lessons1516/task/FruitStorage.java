package com.lidiya.project.lessons1516.task;

import java.util.*;

public class FruitStorage {
    private int numberOfSlots;
    private int initNumberOfSlots;
    private ArrayList<FruitToStorageInfo> fruits = new ArrayList<>();

    public FruitStorage(int numberOfSlots) {
        if (numberOfSlots <= 0)
            throw new IllegalArgumentException(" количество фруктов не может быть меньше нуля.");
        this.numberOfSlots = numberOfSlots;
    }

    public ArrayList<FruitToStorageInfo> getFruits() {
        return fruits;
    }
    public boolean addToStorage(FruitToStorageInfo toStorageInfo) {
        for (int i = 0; i < fruits.size(); i++) {
            if (toStorageInfo == fruits.get(i)) {
                System.out.println("Данный тип уже существует в хранилище");
                return false;
            }

        }

        if (toStorageInfo == null || toStorageInfo.getType() == null) {
            System.out.println("Информация о фрукте не может быть null.");
            return false;
        }

        if (toStorageInfo.getCount() > numberOfSlots) {
            System.out.println("Количество фруктов больше вместимости хранилища.");
            return false;
        }

        if (fruits.size() == 0) {
            fruits.add(toStorageInfo);
            numberOfSlots -= toStorageInfo.getCount();
            return true;
        }

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).equals(toStorageInfo)) {
                fruits.get(i).setCount(fruits.get(i).getCount() + toStorageInfo.getCount());
                numberOfSlots -= toStorageInfo.getCount();
                return true;
            }
        }

        for (int i = 0; i < fruits.size(); i++) {
            if (!fruits.get(i).equals(toStorageInfo)) {
                fruits.add(toStorageInfo);
                numberOfSlots -= toStorageInfo.getCount();
                return true;
            }
        }
        return false;
    }

    public int getNumberOfFruitsByType(FruitToStorageInfo.FruitType fruitType) {
        if (fruitType == null) {
            System.out.println("Информация о фрукте не может быть null.");
            return 0;
        }

        int sum = 0;

        for (FruitToStorageInfo fruit : fruits) {
            if (fruitType.equals(fruit.getType()))
                sum += fruit.getCount();
        }
        return sum;
    }

    public int getNumberOfEmptySlots() {
        return numberOfSlots < initNumberOfSlots ? initNumberOfSlots - numberOfSlots : numberOfSlots;
    }

    public void increasePrice(int value) {
        if (value < 10 || value > 29) {
            System.out.println("Значение в процентах должно быть между 10 и 29");
            return;
        }

        for (FruitToStorageInfo fruit : fruits) {
            fruit.setPrice(Math.round(fruit.getPrice() * (value / 100.0 + 1) * 100.0) / 100.0);
        }
    }

    public List<FruitToStorageInfo> getFruitsByTypeAndPrice(FruitToStorageInfo.FruitType fruitType, int maxPrice) {
        if (maxPrice <= 0) {
            System.out.println("Цена не может быть меньше или равна нулю.");
            return null;
        } else if (fruitType == null) {
            System.out.println("Информация о фрукте не может быть null.");
            return null;
        }

        ArrayList<FruitToStorageInfo> list = new ArrayList<>();

        for (FruitToStorageInfo fruit : fruits) {
            if (fruitType.equals(fruit.getType())) {
                if (fruit.getPrice() <= maxPrice) list.add(fruit);
            }
        }
        return list;
    }

    public double getMinPriceByType(FruitToStorageInfo.FruitType fruitType) {
        double min = Double.MAX_VALUE;

        if (fruitType == null) {
            System.out.println("Информация о фрукте не может быть null.");
            return 0;
        }

        for (FruitToStorageInfo fruit : fruits) {
            if (fruitType.equals(fruit.getType())) {
                if (fruit.getPrice() < min) min = fruit.getPrice();
            }
        }

        if (min == Double.MAX_VALUE) {
            System.out.println("В хранилище отсутствуют фрукты");
            return 0;
        }
        return min;
    }

    public <T> List<FruitToStorageInfo>  sortFruits(Comparator<FruitToStorageInfo> T) {
        List<FruitToStorageInfo> sortedList = new ArrayList<>();
        sortedList = fruits;
        sortedList.sort(T);
        return sortedList;
    }
}


