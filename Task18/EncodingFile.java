package Task18;

import java.io.*;
import java.nio.charset.Charset;

class EncodingFile {
    void convert() throws IOException {
        File fileInput = new File("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\Test\\Textinput.txt");
        try(Writer writer = new OutputStreamWriter(new FileOutputStream(fileInput), Charset.forName("cp866"))) {
            FileReader fileReader = new FileReader("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\Test\\Text.txt");
            int a;
            while((a = fileReader.read()) != -1) {
                writer.write(a);
            }
        }

    }
}
