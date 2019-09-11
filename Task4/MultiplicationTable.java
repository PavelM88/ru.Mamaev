package Task4;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                int multitable = a * b;
                System.out.print(multitable + "   ");
            }
            System.out.println();
        }
    }
}
