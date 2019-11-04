package task14;

import task7.DrinkList;

import java.util.Scanner;

class MachineLogic {
    static void listMenu() {
        System.out.println("     *** МЕНЮ ***");
        for (DrinkList drinkList  : DrinkList.values()){
            System.out.println(drinkList + " - " + drinkList.getPrice() + drinkList.getCurrency());
        }
    }
    static void selectionMenu(int enterAmount) {
        System.out.println("У вас на балансе: " + enterAmount + " RUB");
        System.out.println("Выберете напиток: ");
        System.out.println("Введите 1 для выбора CAPPUCCINO");
        System.out.println("Введите 2 для выбора ESPRESSO");
        System.out.println("Введите 3 для выбора AMERICANO");
        System.out.println("Введите 4 для выбора LATTE");
        System.out.println("Введите 0 для отмены");
    }
    static void actionMenu(Scanner scanner, int enterAmount) {
        int action = scanner.nextInt();

        switch (action) {
            case (1) : getDrink (enterAmount, DrinkList.CAPPUCCINO);
                break;
            case (2) : getDrink (enterAmount, DrinkList.ESPRESSO);
                break;
            case (3) : getDrink (enterAmount, DrinkList.AMERICANO);
                break;
            case (4) : getDrink (enterAmount, DrinkList.LATTE);
                break;
            case (0) : break;
            default:
                System.out.println("Вы выбрали несуществующий напиток");
        }
    }
    private static void getDrink(int enterAmount, DrinkList menu) {
        if (enterAmount >= menu.getPrice()) {
            System.out.println("Ваш кофе готов");
        } else {
            System.out.println("У вас недостаточно средств");
        }
    }
}
