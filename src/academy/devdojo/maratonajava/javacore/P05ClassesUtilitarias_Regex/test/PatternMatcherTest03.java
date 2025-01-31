package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // Range
        // []
        
        String regex = "0[xx][0-9a-fA-F]";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto  "+texto2);
        System.out.println("indice 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+ " "+ matcher.group()+"\n");
        }       
        
    }

}
