package task19;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Check {
    void printCheck() throws IOException {
            File file = new File("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\src\\Task19\\check");
            Scanner input = new Scanner(file);
            Float sum = 0f;
            while (input.hasNext()) {
                String line = input.nextLine();
                Float f = input.nextFloat();
                Float f1 = input.nextFloat();
                Float f2 = f1 * f;
                sum += f2;
                System.out.printf("%-16s %8.2f x %7.3f  =%10.2f\n", line, f1, f, f2);
                if (input.hasNext())
                input.nextLine();
            }
            System.out.println("================================================");
            String string = "Итого:";
        System.out.printf("%s %41.2f", string, sum);
            input.close();
    }

    void checkInfo() {
        String s1 = "Наименование";
        String s2 = "Цена";
        String s3 = "Кол-во";
        String s4 = "Стоимость";
        System.out.printf("%s  %10s %11s %11s \n", s1, s2, s3, s4);
        System.out.println("================================================");
    }
}


