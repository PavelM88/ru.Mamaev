package Task15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("TestData/a/b/c");
        file.mkdirs();
        File file1 = new File("TestData/a/1a.txt");
        file1.createNewFile();
        File file2 = new File("TestData/a/b/c/1c.txt");
        file2.createNewFile();
        File file3 = new File("TestData/a/b/c/newFile.txt");
        if (file2.exists()) {
            System.out.println(file2.renameTo(file3));
        }
        try {
            File source = new File("TestData/a/b/File1.txt");
            File copyFile = new File("TestData/a/b/destFile.txt");
            copyFiles(source, copyFile);
            System.out.println(copyFile.getPath());
        } catch (IOException ex) {
            ex.getMessage();
        }
        deleteFile(file1);
        recursive(new File("C:\\Users\\paxat\\IdeaProjects\\ru.Mamaev\\TestData"));
    }

     private static void copyFiles(File source, File copyFile) throws IOException {
        Files.copy(source.toPath(),copyFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void deleteFile(File remove) {
        File delFile = new File("TestData/a/1a.txt");
        delFile.delete();
    }

    private static void recursive (File root) {
        if (root != null && root.exists()) {
            for (File file : root.listFiles()) {
                if (file.isDirectory()) {
                    recursive(new File(file.getAbsolutePath()));
                    System.out.println("Dir: " + file.getAbsoluteFile());
                } else {
                     System.out.println("File: " + file.getAbsoluteFile());
                }
            }
        }
    }
}
