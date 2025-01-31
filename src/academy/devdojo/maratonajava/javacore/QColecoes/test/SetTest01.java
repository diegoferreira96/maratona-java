package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.HashSet;
import java.util.Set;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

public class SetTest01 {
    public static void main(String[] args) {
        Set<TimesFutebol> timesDeFutebol = new HashSet<>(); // Não permite objetos duplicados.
        timesDeFutebol.add(new TimesFutebol(10101L, "CORINTHIANS", 3429.9,1));
        timesDeFutebol.add(new TimesFutebol(10102L, "PALMEIRAS", 9532.6,3));
        timesDeFutebol.add(new TimesFutebol(10103L, "SÃO PAULO", 4825.2,3));
        timesDeFutebol.add(new TimesFutebol(10105L, "FLAMENGO", 8183.5,3));
        timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2,1));
        timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2,2));

       for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
       }
    }

}
