package task4;

public class Progression {
    //Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
    // an = a1 + d(n-1)
    public static void main(String[] args) {
        int an, n, a1 = 0, d = 2;
        for (n = 1; n <= 10; n++) {
            an = a1 + d * (n - 1);
            System.out.println(an);
        }
    }
}
