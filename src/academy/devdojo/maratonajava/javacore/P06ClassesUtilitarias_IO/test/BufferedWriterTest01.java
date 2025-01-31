package academy.devdojo.maratonajava.javacore.P06ClassesUtilitarias_IO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Diego Ferreira\n");
            bw.newLine();
            bw.flush();            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
