package com.lidiya.project.kursovaya;

public class Owner {
    private String name;
    private String surname;
    private int year;

    public Owner(String name, String surname, int year) {
        if ( name==null){
            throw  new IllegalArgumentException("Имя не может быть пустым");
        };
        if ( surname==null){
            throw  new IllegalArgumentException("Фамилия не может быть пустым");
        };
        if ( year <= 16){
            throw  new IllegalArgumentException("Возраст не  может быть меньше 16");
        }
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

