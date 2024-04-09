package com.lidiya.project.lesson17;

import java.awt.image.ImageProducer;
import java.util.*;

public class Lesson17 {
    // интерфейс Map<KeyType, ValueType>
    // предоставляет набор методов для работы с ассоциациями: ключ - значение
    // одному ключу всегда соответствует только одно значение
    // ключи не могут дублироваться
    // порядок хранения ключей и связанных с ними значений зависит от конкретных реализаций
    // есть возможность получения: set ключей, collection значений, set пар (ключ+значение)


    // Реализации:

    // 1. HashMap<KeyType, ValueType>
    // неупорядоченная по ключам ассоциация
    // позволяет использовать null в качестве ключа
    // реализована на основе hash таблицы
    // capacity = 16

    // 2. LinkedHashMap<KeyType, ValueType>
    // упорядоченная по ключам ассоциация
    // позволяет использовать null в качестве ключа
    // реализована на основе hash таблицы

    // 3. EnumMap<KeyTypeEnum, ValueType>
    // использует только элементы перечислений в качестве ключей
    // хранит только массив значений
    // при создании экземпляра необходимо передавать ссылку на класс перечисления

    // 4. TreeMap<KeyType, ValueType>
    // хранит пары в отсортированном по ключам виде
    // для KeyType должен быть определен натуральный порядок сортировки или
    // в конструктор TreeMap необходимо передать экземпляр Comparator
    // нельзя использовать null в качестве ключа

    // 5. WeakHashMap<KeyType, ValueType>
    // неупорядоченная по ключам ассоциация
    // реализована на основе hash таблицы
    // очищается сборщиком, когда на ключи не остаётся сильных ссылок
    public static void main(String[] args) {
        HashMap<String, Integer>customers = new HashMap<>();
        customers.put("Москва", 790);
        customers.put("Ростов", 300);
        customers.put("Новгород", 210);
        System.out.println(customers.size()); // 3
        customers.put("Ростов", 290);
        System.out.println(customers.size()); // 3
        customers.put(null, 1000);
        customers.put("Самара", 530);
        customers.put("СПб", null);
        System.out.println(customers.size());

        // удаление
        customers.remove(null); // 1000
        customers.remove(null); // null
        customers.remove("СПб"); // null
        customers.remove("СПб"); // null

        customers.remove("Ростов", 300); // false
        customers.remove("СПб", null); // false


        // замена
        // если ключ существует, заменит значение,
        // вернет новое значение
        customers.put("Ростов", 290);
        // если ключ существует, заменит значение,
        // вернет старое значение или null, если ключ отсутствует в мапе
        customers.replace("Самара", 940); // вернет старое значение
        customers.replace("Самара", 940, 944); // true

        // получение (не удаление) значения по ключу
        System.out.println(customers.get("Москва")); // 790
        System.out.println(customers.get("СПб")); // null

        Integer spbValue = customers.getOrDefault("СПб", -1);
        if (spbValue == null || spbValue == -1)
            System.out.println("Информация о городе отсутствует");
        else System.out.println(spbValue);

        if (customers.containsKey("Ростов")) {
            System.out.println("Ключ присутствует в мапе");
            int newValue = customers.get("Ростов") * 2;
            customers.replace("Ростов", newValue);
        }

        if (customers.containsValue(1000)) {
            System.out.println("Количество покупателей 1000 содержится в мапе");
        }

        // коллекция значений
        Collection<Integer> values = customers.values();
        // множество ключей
        Set<String> keys = customers.keySet();
        // множество пар
        Set<Map.Entry<String, Integer>> pairs = customers.entrySet();

        for (Map.Entry<String, Integer> pair : pairs) {
            System.out.println(pair.getKey());
            System.out.println(pair.getValue());

            if (pair.getValue() > 1000) {
                System.out.println("В городе " + pair.getKey() +
                        " более 1000 покупателей");
            }
        }
        // customers.forEach(); - итерация по entrySet()



        // [USER, ADMIN, MODERATOR]
        // 0, 1, 2
        // values[0] = new ...
        // values[1] = new ...
        EnumMap<ClientAuthData.Role, List<ClientAuthData>> clientsByRole =
                new EnumMap<>(ClientAuthData.Role.class);

        clientsByRole.put(ClientAuthData.Role.USER, new ArrayList<>());

        ClientAuthData client01 =
                new ClientAuthData("qwe", "123", ClientAuthData.Role.ADMIN);

        ClientAuthData client02 =
                new ClientAuthData("asd", "234", ClientAuthData.Role.ADMIN);

        ArrayList<ClientAuthData> clientList = new ArrayList<>();
        clientList.add(client01);
        clientList.add(client02);
        clientsByRole.put(ClientAuthData.Role.ADMIN, clientList);

        ClientAuthData client03 =
                new ClientAuthData("user01", "123", ClientAuthData.Role.USER);

        clientsByRole.get(ClientAuthData.Role.USER).add(client03);


        EnumSet<ClientAuthData.Role> roles01 =
                EnumSet.allOf(ClientAuthData.Role.class);

        EnumSet<ClientAuthData.Role> roles02 =
                EnumSet.noneOf(ClientAuthData.Role.class);
        roles02.add(ClientAuthData.Role.USER);
        roles02.add(ClientAuthData.Role.ADMIN);

        EnumSet<ClientAuthData.Role> roles03 =
                EnumSet.of(ClientAuthData.Role.ADMIN,
                        ClientAuthData.Role.MODERATOR);

        EnumSet<ClientAuthData.Role> roles04 =
                EnumSet.range(ClientAuthData.Role.USER,
                        ClientAuthData.Role.values()[2]);

        TreeMap<String, List<String>> students = new TreeMap<>();
        students.put("A", List.of("Иванова", "Петрова"));
        students.put("B", List.of("Григорьев", "Гурова"));
        students.put("C", List.of("Потапова", "Бокарев"));


    }

    public static Map<String, String> getUsersData(
            EnumMap<ClientAuthData.Role, List<ClientAuthData>> map){
        if (map == null) throw new IllegalArgumentException();

        List<ClientAuthData> userData = map.get(ClientAuthData.Role.USER);
        if (userData == null) throw new IllegalArgumentException();

        Map<String, String> result = new HashMap<>();
        for (ClientAuthData user : userData) {
            result.put(user.getUserName(), user.getPassword());
        }
        return result;

    }

    public static void addClientData(EnumMap<ClientAuthData.Role, List<ClientAuthData>> map,
                                     ClientAuthData clientData){
        if (map == null || clientData == null || clientData.getRole() == null) return;
        // ClientAuthData.Role.USER
        // clientData.getRole()

        map.get(clientData.getRole()).add(clientData);

        if (!map.containsKey(clientData.getRole())){
            ArrayList<ClientAuthData> list = new ArrayList<>();
            list.add(clientData);
            map.put(clientData.getRole(), list);
        }

    }








}

