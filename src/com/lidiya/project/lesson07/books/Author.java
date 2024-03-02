package com.lidiya.project.lesson07.books;

//id имя email
public class Author {
public  int id;
public String name ;
public String email;

    // default конструктор / конструктор без параметров
    // new Author();
    public Author(){
        System.out.println("Default author created");
    }
    public Author(int authorId){
        id = authorId;
        System.out.println("Author with ID created");
    }
    public Author(String authorName){
        name = authorName;
        System.out.println("Author with name created");
    }
    public Author( int id,String name, String email){
        this(name);
        this.id =id;
        this.email = email;
        System.out.println("Author with full created");
    }

}
