package com.lidiya.project.lessons1516.task;

import java.util.Comparator;

public class CountComparator implements Comparator<FruitToStorageInfo> {
    @Override
    public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
        return Integer.compare(secondFruitInfo.getCount(), firstFruitInfo.getCount());
    }
}