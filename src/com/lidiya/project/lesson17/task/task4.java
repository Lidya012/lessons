package com.lidiya.project.lesson17.task;

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        /* Реализовать статический void метод, принимающий на вход `String text`
        и выводящий в консоль топ 10 самых часто встречаемых в тексте слов
        (можно добавить условие: артикли и предлоги не считаем за слова). */
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        top10MostFrequentlyEncountered(text);
    }
    public static void top10MostFrequentlyEncountered (String text) {
        if (text == null) throw new IllegalArgumentException("Текст не может быть пустым");

        // создание нужных свойств
        String[] strings = text.split(" ");List<String> stringsArray = List.of(strings);
        Map<Integer, List<String>> countOfLettersInWords = new TreeMap<>();
        int indexFrequency;
        final int mostFrequentlyEncountered = 10; // для вывода 10 частовстречающихся слов
        final List<String> prepositionsAndArticles = List.of("a", "an", "the", "at", "in", "on", "under", "above", "in front of", "between", "behind", "to", "as", "of", "and", "by"); // наиболее популярные артикли (не все)

        // приведение всего текста к нижнему регистру
        for (String string : stringsArray) {
            string.toLowerCase();
        }

        // цикл добавления в мапу с условиями
        for (String string : stringsArray) {
            indexFrequency = Collections.frequency(stringsArray, string);

            if (prepositionsAndArticles.contains(string)) continue; // проверка на артикли
            if (countOfLettersInWords.get(indexFrequency) == null) // проверка на null в значение, и создании коллекции если не было
                countOfLettersInWords.put(indexFrequency, new ArrayList<>());
            if (countOfLettersInWords.get(indexFrequency).contains(string)) continue; // проверка на повтор слов
            countOfLettersInWords.get(indexFrequency).add(string);
        }

        // создание одной коллекции из значений мапы (с учетом порядка)
        List<List<String>> temp = new ArrayList<>(countOfLettersInWords.values());
        List<String> collectionOfTop10MostFrequentlyEncountered = new ArrayList<>();
        for (List<String> list : temp)
            collectionOfTop10MostFrequentlyEncountered.addAll(list);

        // вывод последних 10 слов (в нашем случае, те которые чаще всего встречаются)
        for (int i = 1; i < mostFrequentlyEncountered; i++)
            System.out.println(collectionOfTop10MostFrequentlyEncountered.get(collectionOfTop10MostFrequentlyEncountered.size() - i));
    }
}

