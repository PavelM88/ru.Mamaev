package task18;

import java.io.*;
import java.nio.charset.Charset;

class EncodingFile {
    void  creatFile () throws IOException {
        File file =new File("Test");
        file.mkdir();
        File file1 = new File("Test/Textinput.txt");
        file1.createNewFile();
        Writer writer = new BufferedWriter(new FileWriter("Test/Text.txt"));
        writer.write("Написать программу, которая копирует файл с одной кодировкой в файл с другой.\n");
        writer.close();
    }
    void convert() throws IOException {
        File fileInput = new File("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\Test\\Textinput.txt");
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(fileInput), Charset.forName("cp866"))) {
            FileReader fileReader = new FileReader("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\Test\\Text.txt");
            int a;
            while((a = fileReader.read()) != -1) {
                writer.write(a);
            }
        }
        BufferedReader reader = new BufferedReader(new FileReader("Test/Textinput.txt"));
        System.out.println(reader.readLine());
    }
}
