package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi,Diego,Sandro";
        Scanner scanner  =new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int "+ i);
            }else if (scanner.hasNextBoolean()) {
                boolean b = scanner.hasNextBoolean();  
                System.out.println("Boolean "+ b);              
            }else{
                System.out.println(scanner.next());
            }        
            }
        }
        
    }


