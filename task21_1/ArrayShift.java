package task21_1;


public class ArrayShift {
    public static void main(String[] args) {
        int [][] twoArray = {{1,2,3,4,5,6,7,8,9,10},{1,2,3,4,5,6,7,8,9,10}};
        for (int i = 0; i < 2; i++){
            for (int j = 0; j <10; j++){
                System.out.print("[" + twoArray[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
        toLeft(twoArray);
        showMas(twoArray);
    }
    private static void toLeft(int[][] mas) {
        int temp = 0;
        int a;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas[i].length; ++j) {
                a = mas[i][j];
                mas[i][j] = mas[i][j - 1];
                mas[i][j - 1] = a;
            }
            mas[0][9] = temp;
        }
        mas[1][9] = temp;
    }

    private static void showMas(int[][] mas){
        for (int i = 0; i <mas.length ; i++) {
            for (int j = 0; j <mas[i].length ; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
