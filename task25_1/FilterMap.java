package task25_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FilterMap {
    public static void main(String[] args) {
        Map<String, String> getPerson = generateMap();
        isUnique(getPerson);
        Map<String, String> getPerson2 = generateMap2();
        isUnique(getPerson2);
    }

    private static Map<String, String> generateMap() {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Вася", "Иванов");
        personMap.put("Петр", "Петров");
        personMap.put("Виктор", "Сидоров");
        personMap.put("Сергей", "Савельев");
        personMap.put("Вадим", "Викторов");
        return personMap;
    }

    private static Map<String, String> generateMap2() {
        Map<String, String> personMap2 = new HashMap<>();
        personMap2.put("Вася", "Иванов");
        personMap2.put("Петр", "Петров");
        personMap2.put("Виктор", "Иванов");
        personMap2.put("Сергей", "Петров");
        personMap2.put("Вадим", "Викторов");
        return personMap2;
    }


    private static boolean isUnique(Map<String, String> map) {
        HashMap<String,String> hashMap = new HashMap<>(map);
         for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            int replay = Collections.frequency(hashMap.values(), entry.getValue());
            if (replay > 1) {
                System.out.println(false);
                return false;
            }
         }
         System.out.println(true);
         return true;
    }
}
