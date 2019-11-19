package task27;

public class FibonacciSeries {
    public static void main(String[] args) {
        iterationFibonacci(10);
        info(10);
    }

    private static void info(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(recursionFibonacci(i) + " ");
        }
    }

    private static void iterationFibonacci(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 0; i < num; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        System.out.println();
    }

    private static int recursionFibonacci(int num) {
        if ((num == 1) || (num == 0)) {
            return num;
        }
        return recursionFibonacci(num - 1) + recursionFibonacci(num - 2);
    }
}
