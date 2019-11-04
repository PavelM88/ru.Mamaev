package task3;

import java.util.Scanner;

public class NewZarplata {
    public static void main(String[] args) {
        System.out.println("Введите вашу зарплату:");
        Scanner scanner = new Scanner(System.in);
        int wages = scanner.nextInt();
        double ndfl = 0.13; // 13%/100
        double taxndfl = wages * ndfl;
        System.out.println(wages - taxndfl + " зарплата на руки");
    }
}
