package task29;


import java.util.*;

public class MapPerson {
    public static void main(String[] args) {
        Map<String, Person> map = createMap();
        showMap(map);
        removeTheDuplicates(map);
        System.out.println();
        showMap(map);
    }

    private static Map<String, Person> createMap() {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29, "Петрова", "жен");
        Person person2 = new Person(34, "Сидорова", "жен");
        Person person3 = new Person(34, "Тихонова", "жен");
        Person person4 = new Person(35, "Петров", "муж");
        book.put("key1", person1);
        book.put("key2", person1);
        book.put("key3", person2);
        book.put("key4", person3);
        book.put("key5", person4);
        book.put("key6", person4);
        return book;
    }

    private static void removeItemFromMapByValue(Map<String, Person> map, Person value) {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    private static void removeTheDuplicates(Map<String, Person> map) {
        HashMap<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> entry : copy.entrySet()) {
            int count = Collections.frequency(map.values(), entry.getValue());
            if (count > 1) {
                removeItemFromMapByValue(map, entry.getValue());
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }

    private static void showMap(Map<String, Person> map) {
        for (Map.Entry<String, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().toString());
        }
    }
}
