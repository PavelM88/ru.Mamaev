package task13;

public class Mama {
    public static void main(String[] args) throws FoodIsNotTastyException {
        Child child = new Child();
        try {
            child.likeFood();
            System.out.println("Спасибо, мама.");
        }
        catch (FoodIsNotTastyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
