package task25_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FilterMap {
    public static void main(String[] args) {
        Map<String, String> filter = person1();
        isUnique(filter);
        Map<String, String> filter1 = person2();
        isUnique(filter1);
    }

    private static Map<String, String> person1() {
        Map<String, String> filter = new HashMap<>();
        filter.put("Вася", "Иванов");
        filter.put("Петр", "Петров");
        filter.put("Виктор", "Сидоров");
        filter.put("Сергей", "Савельев");
        filter.put("Вадим", "Викторов");
        return filter;
    }

    private static Map<String, String> person2() {
        Map<String, String> filter1 = new HashMap<>();
        filter1.put("Вася", "Иванов");
        filter1.put("Петр", "Петров");
        filter1.put("Виктор", "Иванов");
        filter1.put("Сергей", "Петров");
        filter1.put("Вадим", "Викторов");
        return filter1;
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
