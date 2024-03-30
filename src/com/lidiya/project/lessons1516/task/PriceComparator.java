package com.lidiya.project.lessons1516.task;

import java.util.Comparator;

public class PriceComparator implements Comparator<FruitToStorageInfo> {
        @Override
        public int compare(FruitToStorageInfo firstFruitInfo, FruitToStorageInfo secondFruitInfo) {
            return Double.compare(firstFruitInfo.getPrice(), secondFruitInfo.getPrice());
        }
    }

