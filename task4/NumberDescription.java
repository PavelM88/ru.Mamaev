package task4;

import java.util.Scanner;

public class NumberDescription {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int scanNumber = scanner.nextInt();
        if (scanNumber == 0) {
            System.out.println("Число нулевое");
        }
        if (scanNumber >= 0) {
            System.out.println("Число положительное");
        }
        else {
            System.out.println("Число отрицательное");
        }
        if (scanNumber % 2 ==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }

    }
}
