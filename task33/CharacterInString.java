package task33;


import java.util.*;


public class CharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово или строку: ");
        String line = scanner.nextLine();
        maxCharInString(line);
    }

    private static void maxCharInString(String line) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            Character sumb = line.charAt(i);
            int value = 1;
            if (map.containsKey(sumb)) {
                value = map.get(sumb) + 1;
            }
            map.put(sumb, value);
        }
        Set<Map.Entry<Character, Integer>> setValue = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = setValue.iterator();
        Map.Entry<Character, Integer> max = null;
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (max == null) {
                max = entry;
            }
            if (entry.getValue() > max.getValue()) {
                max = entry;
            }
        }
        System.out.print("Максимально встречающийся символ в строке: " + max.getKey() +
                " кол-во поторений: " + max.getValue());
    }
}
