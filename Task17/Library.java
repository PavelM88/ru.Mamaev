package Task17;

import java.io.*;

class Library {
    void addBook () {
       try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Library.txt",true));
            String text;
            System.out.print("Введите название и автора книги :");
            while (!(text=br.readLine()).equals("esc")) {
                bw.write(text + "\n");
                System.out.print("Введите " +"esc" +" для выхода:");
                bw.flush();
            }
            bw.close();
            br.close();
       } catch (IOException ex) {
           ex.getMessage();
       }
    }
    void bookList() {
       try {
            BufferedReader reader = new BufferedReader(new FileReader("Library.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
       } catch (IOException e) {
           e.getMessage();
       }
    }
}
