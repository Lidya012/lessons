package com.lidiya.project.lesson17.task;

import java.util.*;



//Реализовать статический метод, который принимает Collection<String> strings и возвращает
// количество одинаковых слов в коллекции strings в виде Map<String, Long>.
// Где ключи - слова, а значения - количество повторений.
public class task1 {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>();
        Collections.addAll(collection, "кошка", "собака", "кошка", "попугай", "змея", "собака", "кошка");
        System.out.println(getNumberOfIdenticalWords(collection));

    }
    public static Map<String, Long> getNumberOfIdenticalWords(Collection<String> strings){
        if (strings == null) throw new IllegalArgumentException("Коллекция не может быть null");
        Map<String, Long> identicalWords = new HashMap<>();
        long countWords;
        for (String string : strings) {
            if (string == null) continue;
            countWords = Collections.frequency(strings, string);
            identicalWords.put(string, countWords);
        }
        return identicalWords;
    }
}