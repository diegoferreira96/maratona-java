package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // alguns dos meta caracteres
        // \d => Retorna todos os digitos
        // \D => Retorna tudo o que não for digito
        // \s => Espaços em branco \t \n \f \r
        // \S => Todos os caracteres excluindo os em branco
        // \w => Retorna A-Z, todos os digitos e _
        // \W => Tudo o que não for incluso no \w
        String regex = "\\W";
        //String texto = "abaaba";
        String texto2 = "@#$hhj 212gvh2 1kh2_";
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
