package Task3;

import java.util.Scanner;

public class NewTime {
    public static void main(String[] args) {
        System.out.println("Введите секунды:");
        Scanner scanner = new Scanner(System.in);
        int second = scanner.nextInt();
        int converhourTosec = 3600;
        System.out.println(second / converhourTosec + " час");
    }
}
