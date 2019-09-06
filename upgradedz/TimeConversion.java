package task1.upgradedz;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input sec: "); // Вводим 3600 секунд
        int sec = in.nextInt();
        int hour = 3600; // В 1 часе 3600 секунд
        System.out.println(sec / hour + " час");
        in.close();
    }
}

