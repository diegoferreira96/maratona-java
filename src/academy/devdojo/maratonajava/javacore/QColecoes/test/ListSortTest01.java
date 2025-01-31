package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> timesDeFutebol = new ArrayList<>();
        timesDeFutebol.add("Corinthians");
        timesDeFutebol.add("Palmeiras");
        timesDeFutebol.add("São Paulo");
        timesDeFutebol.add("Santos");
        timesDeFutebol.add("Flamengo");
        timesDeFutebol.add("Botafogo");
        timesDeFutebol.add("Vasco");
        timesDeFutebol.add("Fluminense");

        Collections.sort(timesDeFutebol); // String => passando em ordem alfabetica | Integer => passando em ordem numerica

        for (String times : timesDeFutebol) {
            System.out.println(times);
        }
    }

}
