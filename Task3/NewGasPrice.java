package Task3;

import java.util.Scanner;

public class NewGasPrice {

    public static void main(String[] args) {
        int GasPrice = 43; // цена 1 литра бензина
        System.out.println("Введите нужное количество бензина:");
        Scanner scanner = new Scanner(System.in);
        int GasCount = scanner.nextInt();
        System.out.println("Конечная стоимость бензина " + "= " + GasCount * GasPrice + " руб");
    }
}
