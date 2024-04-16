package com.lidiya.project.lesson1920.task;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Article {
    private HashMap<String, Author> authors;
    private String title;

    private Category category;
    private LocalDateTime published;

    public Article(String title, Category category, Author... authors) {
        this.authors = new HashMap<>();
        // Author... authors - массив авторов
        for (Author author : authors) {
            this.authors.put(author.getEmail(), author);
        }
        this.title = title;
        this.category = category;
        published = LocalDateTime.now().minusHours((long) (Math.random() * 24));
    }

    public LocalDateTime getPublished() {
        return published;
    }

    public Category getCategory() {
        return category;
    }

    public HashMap<String, Author> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    public enum Category {
        FOOD, TRAVELLING, SHOPPING, HISTORY
    }
}
