package task1.upgradedz;
import java.util.Scanner;

public class NewGasPrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input liter: "); // Вводим 50 литров
        int liter = in.nextInt();
        double Price = 43; // цена 1 литра бензина
        System.out.println( "Summa "+ "=" + liter * Price);
        in.close();
    }
}
