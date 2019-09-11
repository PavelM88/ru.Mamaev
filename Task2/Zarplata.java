package Task2;

public  class Zarplata {

    public static void main(String[] args) {
        double zp = 70000;  // зарплата до вычета ндфл
        double ndfl = 0.13; // НДФЛ 13% / 100
        double taxndfl = zp * ndfl;
        System.out.println("Вычет НДФЛ " + "= " + taxndfl +" руб");
        double salary = zp - taxndfl; // вычет ндфл
        System.out.println(salary + " руб" + " -" + " Зарплата на руки.");

        System.out.println("Вычет НДФЛ " + "= " + taxndfl +" руб");
        double salary1 = zp - taxndfl; // вычет ндфл
        System.out.println(salary + " руб" + " -" + " Зарплата на руки.");
    }
}
