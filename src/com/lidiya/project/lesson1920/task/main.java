package com.lidiya.project.lesson1920.task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;


public class main {
    public static void main(String[] args) {
        Author author01 = new Author("Alex", "email01", LocalDate.of(1989, 02, 4));
        Author author02 = new Author("Elena", "email02", LocalDate.of(1994, 12, 14));
        Author author03 = new Author("Misha", "email03", LocalDate.of(1970, 10, 7));
        Author author04 = new Author("Kate", "email04", LocalDate.of(1983, 06, 25));
        Author author05 = new Author("Anna", "email05", LocalDate.of(1999, 07, 01));

        Article article01 = new Article("News", Article.Category.HISTORY, author01, author04);
        Article article02 = new Article("Traveling", Article.Category.TRAVELLING, author01, author02, author05);
        Article article03 = new Article("Shopping", Article.Category.SHOPPING, author01, author04, author02, author03);
        Article article04 = new Article("ShoppingNews", Article.Category.SHOPPING, author01, author02, author03);

        ArrayList<Article> articleList = new ArrayList<>();
        Collections.addAll(articleList, article01, article02, article03, article04);
        System.out.println(task01(articleList));
        System.out.println(task02(articleList, Article.Category.SHOPPING));
        System.out.println(task03(articleList, Article.Category.TRAVELLING, 4, 40));
        System.out.println(task04(articleList, Article.Category.SHOPPING));
    }


        public static double task01(ArrayList<Article> articles) {
            // Вернуть средний возраст авторов статей
            if (articles == null) throw new IllegalArgumentException();
            List<OptionalDouble> avgAge = articles.stream()
                    .map(list -> list.getAuthors().values()
                            .stream()
                            .mapToDouble(author -> LocalDate.now().getYear() - author.getBirth().getYear())
                            .average())
                    .collect(Collectors.toList()); // преобразовываем в неизменяемый лист
            double sumElement = avgAge.stream().mapToDouble(element -> element.getAsDouble()).sum(); // сумма всех элементов листа avgAge
            return sumElement;

    }
    public static List<String> task02 (ArrayList<Article> articles, Article.Category category) {
        // Вернуть список email авторов статей категории == category
        if (articles == null || category == null) throw new IllegalArgumentException();
        return articles.stream()
                .filter(article -> article.getCategory() == category) // сортируем статьи по нужной категории
                .flatMap(article -> article.getAuthors().values().stream() // получаем set авторов и вызываем новый поток
                        .map(author -> author.getEmail())) // получаем email типа String
                .collect(Collectors.toList());
    }
    public static List<Article> task03(ArrayList<Article> articles, Article.Category category, int min, int max) {
    // Вернуть список статей категории == category,
    // возраст авторов которых попадает в диапазон от min до max
    if (articles == null || category == null) throw new IllegalArgumentException();
    if (min < 1 || min > max || max < min || max > 150) throw new IllegalArgumentException();
    return articles.stream()
            .filter(article -> article.getCategory() == category) // фильтр по категории
            .filter(article -> article.getAuthors().values().stream() // фильтр по количеству лет автору
                    .allMatch(author -> LocalDate.now().getYear() - author.getBirth().getYear() > min &&
                            LocalDate.now().getYear() - author.getBirth().getYear() < max))
            .collect(Collectors.toList());
}
    public static List<Article> task04(ArrayList<Article> articles, Article.Category category) {
        // Вернуть список статей категории == category, опубликованных сегодня
        if (articles == null || category == null) throw new IllegalArgumentException();
        return articles.stream()
                .filter(article -> article.getCategory() == category) // фильтр по категории
                .filter(article -> article.getPublished().getDayOfYear() == LocalDate.now().getDayOfYear()) // фильтр по дате публикации
                .collect(Collectors.toList());
    }
}
