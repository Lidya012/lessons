package com.lidiya.project.lesson17.task;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        /* Реализовать статический метод, принимающий на вход `String text`
        и возвращающий `Map<Integer, List<String>>`где ключи - количество букв в словах,
        значения - списки соответствующих слов. */
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        System.out.println(getCountOfLettersInWords(text));
    }

    public static Map<Integer, List<String>> getCountOfLettersInWords(String text) {
        if (text == null) throw new IllegalArgumentException("Текст не может быть пустым");
        String[] strings = text.split(" ");
        Map<Integer, List<String>> countOfLettersInWords = new HashMap<>();

        for (String string : strings) {
            if (countOfLettersInWords.containsKey(string.length()))
                countOfLettersInWords.get(string.length()).add(string);
            else
                countOfLettersInWords.put(string.length(), new ArrayList<>());
        }
        return countOfLettersInWords;
    }
}

