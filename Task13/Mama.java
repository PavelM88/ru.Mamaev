package Task13;

import java.util.Scanner;

public class Mama {
    public static void main(String[] args) throws Child.FoodIsNotTastyException {
        Child child = new Child();
        try {
            child.likeFood();
        }
        finally {
            System.out.println("......");
        }
    }
}
