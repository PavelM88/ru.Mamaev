package Task13;

import java.util.Scanner;

public class Mama {
    public static void main(String[] args) throws Child.FoodIsNotTastyException {
        Child child = new Child();
        try {
            child.likeFood();
            System.out.println("Спасибо, мама.");
        }
        catch (Child.FoodIsNotTastyException f) {
            System.out.println(f.getMessage());
        }
    }
}
