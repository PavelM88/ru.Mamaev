package task8;

public class Calculator {
    public static void main(String[] args) {
        ReadCalculator readCalculator = new ReadCalculator();
        System.out.print("Введите первое число: ");
        double oneNumber = readCalculator.readDouble();
        System.out.print("Введите второе число: ");
        double twoNumber = readCalculator.readDouble();

        Functions functions = new Functions(oneNumber, twoNumber);

        System.out.println("Выберете действие: ");
        System.out.println("Введите 1 для сложения");
        System.out.println("Введите 2 для вычитания");
        System.out.println("Введите 3 для умножения");
        System.out.println("Введите 4 для деления");
        System.out.println("Введите 5 для процента");

        int action = (int) readCalculator.readDouble();

        switch (action) {
            case (1):
                System.out.println(Functions.addition());
                break;
            case (2):
                System.out.println(Functions.subtraction());
                break;
            case (3):
                System.out.println(Functions.multiplication());
                break;
            case (4):
                System.out.println(Functions.division());
                break;
            case (5):
                System.out.println(Functions.percent());
            default:
                System.out.println("Вы выбрали не существующую функцию");
        }
    }
}
