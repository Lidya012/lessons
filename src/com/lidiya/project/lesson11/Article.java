package com.lidiya.project.lesson11;

public class Article {
    public void setCountry(Country country) {
        this.country = country;
    }

    private Country country;

    public Article(Country contry){
        this.country = contry;
    }

    public Country getCountry() {
        return country;
    }
}
