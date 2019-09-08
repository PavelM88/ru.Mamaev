package task2;

public  class Zarplata {
    static double zp = 70000;  // зарплата до вычета ндфл
    static double ndfl = 0.13; // НДФЛ 13% / 100


    public static void main(String[] args) {
        double z = zp * ndfl;
        System.out.println("Вычет НДФЛ " + "= " + z +" руб");
        double z1 = zp - z;
        System.out.println(z1 + " руб" + " -" + " Зарплата на руки.");
    }
}
