package Task7;

import java.util.Scanner;


public class VendingMachine {
    public static void main(String[] args) {
        System.out.println("     *** Меню ***");
        for (DrinkList drinkList : DrinkList.values()) {

            System.out.println(drinkList + " - " + drinkList.getPrice() + drinkList.getCurrency());

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внесите сумму для выбора напитка:");
        int enterAmount = scanner.nextInt();
        if (enterAmount > 0) {
        System.out.println("У вас на балансе: " + enterAmount + " RUB");
        System.out.println("Выберете напиток: ");
        System.out.println("Введите 1 для выбора CAPPUCCINO");
        System.out.println("Введите 2 для выбора ESPRESSO");
        System.out.println("Введите 3 для выбора AMERICANO");
        System.out.println("Введите 4 для выбора LATTE");
        System.out.println("Введите 0 для отмены");
        } else {

            System.out.println("Вы не внесли деньги");
            return;
        }


        int action = scanner.nextInt();

        switch (action) {
            case (1) : if (enterAmount >= DrinkList.CAPPUCCINO.getPrice()) {
                System.out.println("Ваш кофе готов");
            } else {
                System.out.println("У вас недостаточно средств");
            }
                break;
            case (2) : if (enterAmount >= DrinkList.ESPRESSO.getPrice()) {
                System.out.println("Ваш кофе готов");
            } else {
                System.out.println("У вас недостаточно средств");

            }
            case (3) : if (enterAmount >= DrinkList.AMERICANO.getPrice()) {
                System.out.println("Ваш кофе готов");
            } else {
                System.out.println("У вас недостаточно средств");
            }
            case (4) : if (enterAmount >= DrinkList.LATTE.getPrice()) {
                System.out.println("Ваш кофе готов");
            } else {
                System.out.println("У вас недостаточно средств");
            }

            case (0) : break;
            default:
                System.out.println("Вы выбрали несуществующий напиток");
        }
    }
}
