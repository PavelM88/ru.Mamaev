package task27;

public class FibonacciSeries {
    public static void main(String[] args) {
        iterationFibonacci();
        System.out.println(recursionFibonacci(10));
        for (int i = 2; i <= 10; i++) {
            System.out.print(recursionFibonacci(i) + " ");
        }
    }

    private static void iterationFibonacci() {
        int firstNumber = 0;
        int secondNumber = 1;
        for (int i = 1; i < 10; i++) {
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
            System.out.print(secondNumber + " ");
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
