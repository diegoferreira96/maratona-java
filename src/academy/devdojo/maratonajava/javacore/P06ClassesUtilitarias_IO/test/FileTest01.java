package academy.devdojo.maratonajava.javacore.P06ClassesUtilitarias_IO.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
           boolean isCreated = file.createNewFile();
           System.out.println("Created "+isCreated);
           System.out.println("path: "+ file.getPath());
           System.out.println("absolute path "+ file.getAbsolutePath());
           System.out.println("is directory "+ file.isDirectory());
           System.out.println("is hidden "+ file.isHidden());
           System.out.println("last modidied "+ file.lastModified());
           boolean isExists = file.exists();
           if (isExists) {
            System.out.println("Delete "+ file.delete());            
           }
           
        } catch (IOException exception) {               
            exception.printStackTrace();
        }
        
    }

}
