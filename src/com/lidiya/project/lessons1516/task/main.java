package com.lidiya.project.lessons1516.task;
import com.lidiya.project.lesson09.Apple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class main {
    public static void main(String[] args) {
        FruitStorage fruitStorage = new FruitStorage(1000);

        FruitToStorageInfo apple1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 564, 65);
        FruitToStorageInfo pear1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 111, 3);
        FruitToStorageInfo banana1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.BANANA, 236, 18);
        FruitToStorageInfo apricot1 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APRICOT, 200, 12);
        FruitToStorageInfo apple2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.APPLE, 130, 14);
        FruitToStorageInfo pear2 = new FruitToStorageInfo(FruitToStorageInfo.FruitType.PEAR, 236, 15);

        fruitStorage.addToStorage(apple1);
        fruitStorage.addToStorage(pear1);
        fruitStorage.addToStorage(banana1);
        fruitStorage.addToStorage(apricot1);
        fruitStorage.addToStorage(apple2);
        fruitStorage.addToStorage(pear2);

        // тестирование методов класса FruitStorage
        System.out.println(fruitStorage.getNumberOfFruitsByType(FruitToStorageInfo.FruitType.APPLE));
        System.out.println(fruitStorage.getNumberOfEmptySlots());
        System.out.println(fruitStorage.getFruitsByTypeAndPrice(FruitToStorageInfo.FruitType.APPLE, 150));
        System.out.println(fruitStorage.getMinPriceByType(FruitToStorageInfo.FruitType.APPLE));

        // Count comparator
        System.out.println("Сортировка по количеству (по убыванию)");
        List<FruitToStorageInfo> countComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> countComparator = new CountComparator();
        countComparatorList = fruitStorage.sortFruits(countComparator);
        for (FruitToStorageInfo fruitToStorageInfo : countComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Type comparator
        System.out.println("Сортировка по типу");
        List<FruitToStorageInfo> typeComparatorlist = new ArrayList<>();
        Comparator<FruitToStorageInfo> typeComparator = new TypeComparator();
        typeComparatorlist = fruitStorage.sortFruits(typeComparator);
        for (FruitToStorageInfo fruitToStorageInfo: typeComparatorlist){
            System.out.println(fruitToStorageInfo);
        }
        // Price comparator
        System.out.println("Сортировка по цене (по возрастанию)");
        List<FruitToStorageInfo> priceComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> priceComparator = new PriceComparator();
        priceComparatorList = fruitStorage.sortFruits(priceComparator);
        for (FruitToStorageInfo fruitToStorageInfo : priceComparatorList) {
            System.out.println(fruitToStorageInfo);
        }
        // Count and price comparator separated classes
        System.out.println("Сортировка по количеству (по возрастанию) и цене (убыванию)");
        List<FruitToStorageInfo> countAndPriceComparatorList = new ArrayList<>();
        Comparator<FruitToStorageInfo> priceReversedComparator = new PriceComparator().reversed();
        Comparator<FruitToStorageInfo> countAndPriceComparator =
                new CountComparator().reversed().thenComparing(priceReversedComparator);
        countAndPriceComparatorList = fruitStorage.sortFruits(countAndPriceComparator);
        for (FruitToStorageInfo fruitToStorageInfo : countAndPriceComparatorList) {
            System.out.println(fruitToStorageInfo);
        }

    }
}

