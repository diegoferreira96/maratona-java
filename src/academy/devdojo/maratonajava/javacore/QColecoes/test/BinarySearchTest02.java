package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        TimesFutebolByIdComparator timesFutebolByIdComparator = new TimesFutebolByIdComparator();
        List<TimesFutebol> timesDeFutebol = new ArrayList<>();
        timesDeFutebol.add(new TimesFutebol(10101L, "CORINTHIANS", 3429.9));
        timesDeFutebol.add(new TimesFutebol(10102L, "PALMEIRAS", 9532.6));
        timesDeFutebol.add(new TimesFutebol(10103L, "SÃO PAULO", 4825.2));
        timesDeFutebol.add(new TimesFutebol(10104L, "SANTOS", 4149.4));
        timesDeFutebol.add(new TimesFutebol(10105L, "FLAMENGO", 8183.5));
        timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2));
        timesDeFutebol.add(new TimesFutebol(10107L, "VASCO", 676.9));
        timesDeFutebol.add(new TimesFutebol(10108L, "FLUMINENSE", 4502.2));

        //Collections.sort(timesDeFutebol);
        timesDeFutebol.sort(new TimesFutebolByIdComparator());

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }

        TimesFutebol timesFutebolToSearch = new TimesFutebol(10103L, "SÃO PAULO", 4825.2);

        System.out.println(Collections.binarySearch(timesDeFutebol, timesFutebolToSearch,timesFutebolByIdComparator));
    }

}
