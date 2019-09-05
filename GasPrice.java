package task1;

public class GasPrice {
    int a = 43; // цена 1 литра бензина
    int b = 50; // нужное количество бензина

  static int ymnozenie(int a, int b) {
      return a*b;
  }

    public static void main(String[] args) {
        System.out.println("Конечная стоимость бензина " + "= " + ymnozenie(43,50) + " руб");
    }
}
