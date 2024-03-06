package com.lidiya.project.lesson09;
//можно использовать в качестве супертипа
//нельзя объявлять свойста объекта, создавать конструкторы
//все модификаторы public
//abstract по умолчанию
public interface Colorable extends Cloneable, Runnable {
    default String getColor(){
        return "red";
    }
    void  color(String color);

}


