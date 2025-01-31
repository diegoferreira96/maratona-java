package academy.devdojo.maratonajava.javacore.P06ClassesUtilitarias_IO.test;

import java.io.File;
import java.io.FileWriter;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Diego Ferreira\n");
            fw.flush();            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
