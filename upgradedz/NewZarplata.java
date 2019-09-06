package task1.upgradedz;

import java.util.Scanner;

public class NewZarplata {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input zp: "); // Вводим 70000( зарплата до вычета НДФЛ)
        int zp = in.nextInt();
        double ndfl = 13.0 / 100.0;
        System.out.println(zp - (zp * ndfl) + " Зарплата на руки");
        in.close();

    }
}
