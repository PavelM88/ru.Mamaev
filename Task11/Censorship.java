package Task11;

import java.util.Scanner;

public class Censorship {

    public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);
//     String keyboard = scanner.nextLine();
//     System.out.println(keyboard.replaceAll("бяка","вырезано цензурой"));
//
        new Censorship().censor();
    }

    private void censor(){
        Scanner scanner1 = new Scanner(System.in);
        String keyboard1 = scanner1.nextLine();
        System.out.println(keyboard1.replaceAll("бяка","вырезано цензурой"));
    }
}
