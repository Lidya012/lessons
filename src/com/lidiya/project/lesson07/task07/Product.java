/*Задача 2. Список разрешенных продуктов
Класс Продукт:
Свойства: название продукта / белки / жиры / углеводы / калории
Минимум 4 конструктора
Реализовать необходимые проверки входящих данных
Создать не менее 4 экземпляров данного класса
Класс МоиРазрешенныеПродукты:
Свойства: максимальное количество белков / максимальное количество жиров /
максимальное количество углеводов / максимальное количество калорий
Реализовать метод, который принимает на Продукт и проверяет его.
 Если характеристики продукта не соответствуют заявленным разрешениям
 (например, слишком большое содержание калорий), метод должен вывести в консоль информацию о несоответствии
  и вернуть false. Если характеристики продукта полностью соответствуют заявленным разрешениям,
  метод должен вернуть true.*/

  package com.lidiya.project.lesson07.task07;
public class Product {
  public String name;
  public double proteins;
  public double fats;
  public double carbohydrates;
  public int calories;

  public Product(){

  }

  public Product(String name, double protein, double fats, double carbohydrates, int calories){
    this.name =name;
    this.proteins = protein;
    this.fats = fats;
    this.carbohydrates = carbohydrates;
    this.calories = calories;
     if("".equals(name))
     throw new IllegalArgumentException("name  не может быть пустой строкой");
     if (protein<0)
       throw new IllegalArgumentException("proteins не может быть меньше 0");
     if (fats<0)
       throw new IllegalArgumentException("fats не может быть меньше 0");
     if(carbohydrates<0)
       throw new IllegalArgumentException("carbohydrates не может быть меньше 0");
     if(calories<0)
       throw new IllegalArgumentException("calories не может быть меньше 0");
  }


  public String getName() {
    return name;
  }

  public double getProteins() {
    return proteins;
  }

  public double getFats() {
    return fats;
  }

  public double getCarbohydrates() {
    return carbohydrates;
  }

  public int getCalories() {
    return calories;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setProteins(double proteins) {
    this.proteins = proteins;
  }

  public void setFats(double fats) {
    this.fats = fats;
  }

  public void setCarbohydrates(double carbohydrates) {
    this.carbohydrates = carbohydrates;
  }

  public void setCalories(int calories) {
    this.calories = calories;
  }
}
