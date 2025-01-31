package academy.devdojo.maratonajava.javacore.P06ClassesUtilitarias_IO.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        try (FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)){
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
            br.readLine();
        }catch (IOException e) {           
            e.printStackTrace();
        }
    }
}


