package com.lidiya.project.lesson12;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        String s = null;
        if(s != null) System.out.println(s.toUpperCase());//NullPointException


        int[] arr = new int[3];
        int index = 3;
        if (index < arr.length) arr[index] = 100;

        Object number = 790;
        if(number instanceof String s1) System.out.println(s1.toUpperCase());
       //ClassException

        String str =null;

        try { // потенциально опасный код
            str = (String) number;//при возникновении ClassCastException
            System.out.println(str);
        } catch (ClassCastException | NullPointerException exp){ // управление передается блоку catch
            System.out.println(exp.getMessage());
        }
        try { // потенциально опасный код
            str = (String) number;//при возникновении ClassCastException
            System.out.println(str);
        } catch (ClassCastException exp){ // управление передается блоку catch
            System.out.println(exp.getMessage());
        }
        catch ( NullPointerException exp){ // управление передается блоку catch
           exp.printStackTrace();
        }
        String[] strings = {"yellow", "yellowgreen", "blue"};

       /* for (String string : strings) {
            try {
                if (string.startsWith("y")) System.out.println(string);
            } catch (){}
        }*/

        /*try {
            for (String string : strings) {
                if (string.startsWith("y")) System.out.println(string);
            }
        } catch (){}*/

        try { // потенциально опасный код
            str = (String) number; //  при возникновении ClassCastException
            System.out.println(str);
        } catch (RuntimeException exp){ // управление передается блоку catch
            System.out.println(exp.getMessage());
        }

        try { // потенциально опасный код
            str = (String) number; //  при возникновении ClassCastException
            System.out.println(str);
        } catch (ClassCastException | NullPointerException ex01){
            System.out.println(ex01.getMessage());
        } catch (RuntimeException exp){ // управление передается блоку catch
            System.out.println(exp.getMessage());
        }

        // Exception и его наследники (кроме Runtime)
        // исключения времени компиляции
        // обрабатываемые (разработчик обязан их обрабатывать)
        // Runtime и его наследники
        // исключения времени выполнения
        // необрабатываемые (разработчик не обязан их обрабатывать)
    }


    public static void read()/* throws IOException */{
        Scanner scanner = new Scanner(System.in);
        String filename = "file.xml";// scanner.nextLine();

        try {
            readFromFile(filename);
        } catch (IOException e) {
            throw new RuntimeException("Ошибка в имени файла", e);
        }
    }


    public static void readFromFile(String filename) throws IOException{
        if (!filename.endsWith(".json") && !filename.endsWith(".xml")){
            throw new IOException("filename is not valid");
        }
        // if (filename.endsWith(".json") || filename.endsWith(".xml")){
        // логика чтения из json или xml
        // }

        String message = "" + LocalDateTime.now();
    }

    // объявить собственный класс исключения времени компиляции
    // конструктор принимает на вход сообщение
    // конструктор принимает на вход сообщение и Throwable
    // реализовать собственную логику метода getMessage:
    //     логика родителя + собственная



    }
