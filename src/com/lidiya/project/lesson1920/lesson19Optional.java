package com.lidiya.project.lesson1920;

import java.util.Optional;


public class lesson19Optional {
    // Optional<T> - null-safe контейнер,
    // который может содержать ссылку на экземпляр T класса или null ссылку

    String name = "Tom";

    // Создание объекта

    // 1. если name == null, будет выброшено исключение
    Optional<String> optional01 = Optional.of(name);

    // 2. если name == null, будет создан контейнер с null ссылкой
    Optional<String> optional02 = Optional.ofNullable(name);

    // 3. создает контейнер с null ссылкой
  Optional<String> optional03 = Optional.empty();

    // Проверка
/*
        if (optional02.isEmpty()) {
        System.out.println("Контейнер содержит null ссылку");
    }

        if (optional02.isPresent()) {
        System.out.println("Контейнер не содержит null ссылку");
    }

    // Получение значений или новых Optional

    // 1. если контейнер содержит null ссылку, будет выброшено исключение
    String get = optional02.get();

    // 2. если контейнер содержит null ссылку, метод вернет значение по-умолчанию.
    // Объект, переданный в метод, будет создан в любом случае
    String orElse = optional02.orElse("default");

    // 3. если контейнер содержит null ссылку, метод вернет значение по-умолчанию и
    // объект, переданный в метод, не будет создан
    String orElseGet = optional02.orElseGet(() -> "default");

    // 4. вернет значение или выбросит исключение, если в контейнере null ссылка
    String value01 = optional02.orElseThrow();

    // 5. вернет значение или выбросит исключение, если в контейнере null ссылка
    String value02 = optional02.orElseThrow(() ->
            new IllegalArgumentException("null в контейнере"));

    // 6. вернет Optional со ссылкой на значение из optional02,
    // если оно соответствует условию value.length() < 10,
    // в противном случае вернет Optional с null ссылкой
    Optional<String> filter = optional02.filter(value -> value.length() < 10);

    // 7. вернет Optional со значением, которое возвращает метод apply экземпляра Function
    // или контейнер с null ссылкой, если optional02 содержал null ссылку
    Optional<Integer> map = optional02.map(value -> value.length());

    // 8. вернет Optional со значением numberOptional или новый Optional контейнер
    int percent = 10;
   Optional<Number> numberOptional = Optional.ofNullable(percent);
    Optional<Number> or = numberOptional.or(() -> Optional.of(1.1));

    // Выполнение инструкций, в зависимости от содержимого

    // 1. выполнится, если optional02 не содержит null ссылку
        optional02.ifPresent(value -> System.out.println(value.toUpperCase()));

    // 2.
        optional02.ifPresentOrElse(
    // выполнится, если optional02 не содержит null ссылку
    value -> System.out.println(value.toUpperCase()),
            // выполнится, если optional02 содержит null ссылку
            () -> System.out.println("Значения не существует")
            );
*/
}


