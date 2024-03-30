package com.lidiya.project.lesson14.task;

public class main {
    public <T> PairContainer<Integer, T[]> bb(T[] elem) {
        // Проверка передаваемого массива на null и на принадлежность к числам
        if (elem == null) throw new IllegalArgumentException();
        if (!(elem[0] instanceof Number)) return null;

        PairContainer pairContainer = new PairContainer();
        double sumEven = 0.0;
        double sumOdd = 0.0;

        for (int i = 0; i < elem.length; i++) {
            if (i % 2 == 0)
                sumEven = sumEven + (int) elem[i];
            else
                sumOdd = sumOdd + (double) elem[i];
        }

        pairContainer.setKey(sumEven);
        pairContainer.setValue(sumOdd);
        return pairContainer;
    }

}
