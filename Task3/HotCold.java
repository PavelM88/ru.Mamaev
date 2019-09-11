package Task3;
import java.util.Random;
import java.util.Scanner;

public class HotCold {
    public static void main(String[] args) {
        int randomNumber;
        int enterNumber; // Введенное число
        int prevAttempt;
        int thisAttempt = 0;

        randomNumber = new Random().nextInt(100) +1;
        System.out.println(randomNumber);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число от 1 до 100 или 0 для выхода:");
            enterNumber = scanner.nextInt();

            if (enterNumber == randomNumber) {
                System.out.println("Вы угадали");
                break;
            }

            prevAttempt = thisAttempt;
            thisAttempt = Math.abs(enterNumber - randomNumber);

            if (prevAttempt >= thisAttempt) {
                System.out.println("Горячо");
            }

            else {
                System.out.println("Холодно");
            }
        } while (enterNumber != 0);
    }
}