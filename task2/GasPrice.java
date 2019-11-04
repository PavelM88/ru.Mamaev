package task2;

public class GasPrice {
    int GasPrice = 43; // цена 1 литра бензина
    int GasCount = 50; // нужное количество бензина

  static int ymnozenie(int GasPrice, int GasCount) {

      return GasPrice*GasCount;
  }

    public static void main(String[] args) {
        System.out.println("Конечная стоимость бензина " + "= " + ymnozenie(43,50) + " руб");
    }
}
