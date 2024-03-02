package com.lidiya.project.lesson07.books;
// идентификатор - обязательное свойство
// название - обязательное свойство
// количество страниц -
// цена - обязательное свойство
// авторы - массив
public class Book {
    private int id;
    private String title;
    private int numberOfPages;
    private int price;
    private Author[] authors; // инициализирвоать массив
    public  Book(int id, String title, int price){
        this.id =id;
        this.title = title;
        this.price = price;
        if (id<=0)
            throw new IllegalArgumentException ("id д.б. положительным");

        if ("".equals(title))
                throw new IllegalArgumentException("title не может быть пустой строкой");
        if (price<=0)
                    throw new IllegalArgumentException("price д.б.больше 100");
    }

 /*if (id > 0) this.id = id;
   if (price > 100) this.price = price;

if (title != null && !title.isEmpty())
            this.title = title;

   if (title != null && !title.equals(""))
            this.title = title;

  if (!"".equals(title))
            this.title = title;*/


    // методы, которые устанавливают значения свойств,
    // называют сеттерами



    public void setNumberOfPages (int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }



    // методы, которые возвращают значения свойств,
    // называют геттерами

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if (price <= this.price) return;
        this.price = price;
    }
}





