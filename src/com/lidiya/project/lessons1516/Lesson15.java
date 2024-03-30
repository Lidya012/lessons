import java.util.*;

public class Lesson15 {
    public static void main(String[] args) {
        // List
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println(arrayList.size()); // 0

        String[] cities = {"Саратов", "Тверь"};

        List<String> strings = Arrays.asList(cities);

        LinkedList<String> linkedList = new LinkedList<>(strings);
        System.out.println(linkedList.size()); // 2

        linkedList.add("Москва");
        linkedList.add("Тверь");

        HashSet<String> hashSet = new HashSet<>(linkedList);
        System.out.println(hashSet.size()); // 3

        // Саратов Тверь Москва
        arrayList.addAll(hashSet);
        arrayList.add("СПб");
        arrayList.add(null);
        arrayList.add("Самара");
        arrayList.add("Самара");

        arrayList.remove("Самара"); // boolean


        System.out.println(arrayList.get(4));

        arrayList.removeIf(element -> "Самара".equals(element));

        // Перебор коллекций
        // 1. foreach - любая коллекция
        for (String string : arrayList) {
            System.out.println(string);
        }
        // 2. fori + while - только List
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        // 3. итератор
        Iterator<String> stringIterator = arrayList.iterator();
        while (stringIterator.hasNext()) {
            String element = stringIterator.next();
            if (element == null) continue;
            System.out.println(element.toUpperCase());
            if ("Самара".equals(element)) stringIterator.remove();
        }
    }
}

        // вызов метода remove в циклах (кроме итератора)
        // для однопоточных коллекций приведет
        // к ConcurrentModificationException
        // arrayList.removeIf(element->"Самара".equals(element));

        // arrayList