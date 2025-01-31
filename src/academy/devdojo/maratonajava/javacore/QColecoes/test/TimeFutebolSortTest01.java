package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

class TimesFutebolByIdComparator implements Comparator<TimesFutebol>{

    @Override
    public int compare(TimesFutebol timeFutebol1, TimesFutebol timeFutebol2) {
        return timeFutebol1.getId().compareTo(timeFutebol2.getId());
    }

}

class TimesFutebolByNomeComparator implements Comparator<TimesFutebol>{

    @Override
    public int compare(TimesFutebol timeFutebol1, TimesFutebol timeFutebol2) {
        return timeFutebol1.getNome().compareTo(timeFutebol2.getNome());
    }
    
}

class TimesFutebolByPontuacaoConmebolComparator implements Comparator<TimesFutebol>{

    @Override
    public int compare(TimesFutebol timeFutebol1, TimesFutebol timeFutebol2) {
        return Double.compare(timeFutebol1.getPontuacaoConmebol(),timeFutebol2.getPontuacaoConmebol());
    }
    
}

public class TimeFutebolSortTest01 {
    public static void main(String[] args) {
        List<TimesFutebol> timesDeFutebol = new ArrayList<>();
        timesDeFutebol.add(new TimesFutebol(10101L, "CORINTHIANS", 3429.9));
        timesDeFutebol.add(new TimesFutebol(10102L, "PALMEIRAS", 9532.6));
        timesDeFutebol.add(new TimesFutebol(10103L, "SÃO PAULO", 4825.2));
        timesDeFutebol.add(new TimesFutebol(10104L, "SANTOS", 4149.4));
        timesDeFutebol.add(new TimesFutebol(10105L, "FLAMENGO", 8183.5));
        timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2));
        timesDeFutebol.add(new TimesFutebol(10107L, "VASCO", 676.9));
        timesDeFutebol.add(new TimesFutebol(10108L, "FLUMINENSE", 4502.2));

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }

        Collections.sort(timesDeFutebol);
        System.out.println("----------------------------------------------------------------------------------");

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }

        Collections.reverse(timesDeFutebol);
        System.out.println("----------------------------------------------------------------------------------");

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }

        Collections.sort(timesDeFutebol, new TimesFutebolByIdComparator());
        System.out.println("---------------------TimesFutebolByIdComparator()---------------------------------");

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }       

        Collections.sort(timesDeFutebol, new TimesFutebolByNomeComparator());
        System.out.println("---------------------TimesFutebolByNomeComparator()---------------------------------");

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }

        Collections.sort(timesDeFutebol, new TimesFutebolByPontuacaoConmebolComparator());
        System.out.println("---------------------TimesFutebolByPontuacaoConmebolComparator()---------------------------------");

        for (TimesFutebol timesFutebol : timesDeFutebol) {
            System.out.println(timesFutebol);
        }
    }

}
