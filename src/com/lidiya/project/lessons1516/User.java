package com.lidiya.project.lessons1516;


import java.util.Objects;

public class User implements Comparable<User>{
    private int id;
    private String city;
    private int age;

    public User(int id, String city, int age) {
        this.id = id;
        this.city = city;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public String getCity() {
        return city;
    }
    public int getAge() {
        return age;
    }

    //по возрастанию
    // по неубыванию
    @Override // определяет натуральный порядок сортировки
    public int compareTo(User other) {  // определен id
        // < 0  - this меньше other (this, other)
        // > 0 - this больше other (other, this)
        // == 0 - this равен other
//        if (this.id < other.id) return -1;
//        if (this.id > other.id) return 1;
//         return 0;
        // тернарный оператор
        // return Integer.compare(this.id, other.id);
        // return this.id - other.id;

        // если идентификаторы равны,
        // то считается меньшим пользователь
        // с меньшим возрастом

        // если возраст одинаковый,
        // то сравнивать по городу пользователя
        // (по алфавиту в порядке возрастания
        //  без учета регистра)
        if (this.id - other.id == 0){
            if (this.age - other.age == 0) {
                return this.city.compareToIgnoreCase(other.city);
            }
            return this.age - other.age;
        }
        return this.id - other.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        return Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}