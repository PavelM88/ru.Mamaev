package task21_1_2;


public class ArrayReverse {
    public static void main(String[] args) {
        int [] mas = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < 9; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        revers(mas);
    }

    private static void revers(int[] mas) {
        System.out.println("Реверс массива:");
        for (int i = 0; i < mas.length/2; i++){
            int temp = mas[i];
            mas[i] = mas[(mas.length - 1) - i];
            mas[(mas.length - 1) - i] = temp;
        }
        for (int i: mas) {
            System.out.print(i + " ");
        }
    }
}
