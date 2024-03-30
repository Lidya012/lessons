package com.lidiya.project.lessons1516.task;

import java.util.Comparator;

public class TypeComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        return firstFruitInfo.getType().compareTo(secondFruitInfo.getType());
    }
}
