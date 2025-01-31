package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // Range []
        // ? zero ou um | * zero ou mais | + uma ou mais | {n,m} n até m | () | o(v|c)o ovo|oco | $ fim da linha
        // . 1.3 = 123, 133, 1@3, 1A3 (CARACTER CURINGA)
        // ^ negação [^abc] => negando abc
        
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "diegoferreira_devweb@hotmail.com, diego-ferreira96@hotmail.com, #@!zoro@mail.br, teste@gmail.com.br, sakura@mail ";
        System.out.println("Email valido");
        System.out.println("zoro@mail.br".matches(regex));
        System.out.println((texto.split(","))[1].trim());
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
