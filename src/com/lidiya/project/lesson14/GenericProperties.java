package com.lidiya.project.lesson14;

public class GenericProperties {
    public static void main(String[] args) {
        User<String> stringUser = new User<>("34rr");
        stringUser.setId(stringUser.getId().toLowerCase());

        User<Number> integerUser = new User<>(1.5);
        integerUser.setId(integerUser.getId().intValue());

        // необработанный / сырой / raw тип
        User rawUser = new User("12");
        // User<Object> rawUser = new User<>("12");
        rawUser.setId(12);
        rawUser.setId(stringUser);
        System.out.println(rawUser.getId().toString());




    }
}
