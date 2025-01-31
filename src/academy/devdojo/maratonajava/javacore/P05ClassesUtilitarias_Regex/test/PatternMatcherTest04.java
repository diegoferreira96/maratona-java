package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // Range []
        // ? zero ou um | * zero ou mais | + uma ou mais | {n,m} n até m | () | o(v|c)o ovo|oco | $ fim da linha
                
        String regex = "0[xx]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto  "+texto);
        System.out.println("indice 0123456789");
        System.out.println("regex "+regex);
        System.out.println("Posições encontradas");

        while (matcher.find()) {
            System.out.print(matcher.start()+" "+ " "+ matcher.group()+"\n");
        }       
        
    }

}
