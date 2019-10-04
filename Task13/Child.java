package Task13;

import java.util.Scanner;

public class Child {

    private Food menu;

    public void likeFood() throws FoodIsNotTastyException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Что будем кушать: ");
        String food1 = scanner.next();
        if (food1.equalsIgnoreCase(menu.getName())) {
            System.out.println("Съел " + food1 + " за обе щёки.");
        } else {
            throw new FoodIsNotTastyException("Спасибо, мама");
        }
    }

    static class FoodIsNotTastyException extends Exception {
        FoodIsNotTastyException(String message) {
            super(message);
        }
    }
}
