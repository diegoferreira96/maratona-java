package academy.devdojo.maratonajava.javacore.P05ClassesUtilitarias_Regex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = " Levi, Diego, Sandro";
        String[] nomes = texto.split(",");
        for (String nome : nomes) {
            System.out.println(nome.translateEscapes());
        }
        
    }

}
