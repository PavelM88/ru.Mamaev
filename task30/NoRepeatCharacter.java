package task30;

import java.util.Scanner;

public class NoRepeatCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();
        System.out.print("Первый неповторяющийся символ: " + getFirstUniqueChar(word));
    }


    private static String getFirstUniqueChar(String line) {
        String result = null;
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            if (line.indexOf(currentChar) == line.lastIndexOf(currentChar)) {
                result = Character.toString(currentChar);
                break;
            }
        }
        return result;
    }
}
