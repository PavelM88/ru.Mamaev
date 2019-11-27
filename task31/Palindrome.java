package task31;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для проверки на полиндром: ");
        String line = scanner.nextLine();
        System.out.println(stringFunctionPalindrome(line));
        System.out.print(lineMovePalindrome(line));
    }

    private static boolean stringFunctionPalindrome(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        stringBuilder.reverse();
        return stringBuilder.toString().equals(text);
    }

    private static boolean lineMovePalindrome(String line) {
        for (int i = 0; i < line.length() / 2; i++) {
            if (line.charAt(i) != line.charAt(line.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
