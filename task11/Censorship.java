package task11;

import java.util.Scanner;

public class Censorship {

    public static void main(String[] args) {
        System.out.print("Введите сообщение: ");
        new Censorship().censor();
    }

    private void censor(){
        Scanner scanner1 = new Scanner(System.in);
        String keyboard1 = scanner1.nextLine();
        System.out.println(keyboard1.replaceAll("(?iu)бяка","вырезано цензурой"));
    }
}
