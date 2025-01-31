package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<TimesFutebol> timesDeFutebol = new ArrayList<>();
        timesDeFutebol.add(new TimesFutebol(10101L, "CORINTHIANS", 3429.9,1));
        timesDeFutebol.add(new TimesFutebol(10102L, "PALMEIRAS", 9532.6,3));
        timesDeFutebol.add(new TimesFutebol(10103L, "SÃO PAULO", 4825.2,3));
        timesDeFutebol.add(new TimesFutebol(10105L, "FLAMENGO", 8183.5,3));
        timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2,1));
        

        Iterator<TimesFutebol> timesIterator = timesDeFutebol.iterator();
        while (timesIterator.hasNext()) {
            TimesFutebol timesFutebol = timesIterator.next();
            if (timesFutebol.getQuantidadeLibertadores() == 1) {
                timesIterator.remove();
            }
            
        }
        System.out.println(timesDeFutebol);

        System.out.println("===========================================");

        timesDeFutebol.removeIf(timeFutebol -> timeFutebol.getQuantidadeLibertadores() == 1);
        System.out.println(timesDeFutebol);
    }

}
