package academy.devdojo.maratonajava.javacore.QColecoes.test;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Smartphone;
import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone>{

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
       return o1.getMarca().compareTo(o2.getMarca());    
    }
    
}

class TimesLibertadoresCompator implements Comparator<TimesFutebol>{

    @Override
    public int compare(TimesFutebol o1, TimesFutebol o2) {
        return Double.compare(o1.getQuantidadeLibertadores(), o2.getQuantidadeLibertadores());
    }
    
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        NavigableSet<TimesFutebol> timesDeFutebol = new TreeSet<>(new TimesLibertadoresCompator());
                timesDeFutebol.add(new TimesFutebol(10101L, "CORINTHIANS", 3429.9,1));
                timesDeFutebol.add(new TimesFutebol(10102L, "PALMEIRAS", 9532.6,3));
                timesDeFutebol.add(new TimesFutebol(10103L, "SÃO PAULO", 4825.2,3));
                timesDeFutebol.add(new TimesFutebol(10105L, "FLAMENGO", 8183.5,3));
                timesDeFutebol.add(new TimesFutebol(10106L, "BOTAFOGO", 1296.2,1));
                timesDeFutebol.add(new TimesFutebol(10107L, "RIVER PLATE", 6500.8,4));
                timesDeFutebol.add(new TimesFutebol(10109L, "PEÑAROL", 2500.5,5));
                timesDeFutebol.add(new TimesFutebol(10110L, "BOCA JUNIORS", 6000.6,6));
                
                        
                for (TimesFutebol timesFutebol : timesDeFutebol) {
                    System.out.println(timesFutebol);            
                }
        
                System.out.println("=====================================================================================");
        
                for (TimesFutebol timesFutebol : timesDeFutebol.descendingSet()) { // ordem alfabetica descrecente
                    System.out.println(timesFutebol);            
                }
                
                TimesFutebol Estudiantes = new TimesFutebol(10108L, "ESTUDIANTES", 3825.2,4);
                
                // lower <
                // floor <=
                // higher >
                // ceiling >=
                
                System.out.println("=====================================================================================");
                System.out.println("O PRIMEIRO TIME QUE TEM MENOS LIBERTADORES QUE O ESTUDIANTES");
                System.out.println(timesDeFutebol.lower(Estudiantes));

                System.out.println("O PRIMEIRO TIME QUE TEM MENOS OU O MESMO NUMERO DE LIBERTADORES QUE O ESTUDIANTES");
                System.out.println(timesDeFutebol.floor(Estudiantes));

                System.out.println("O PRIMEIRO TIME QUE TEM O MESMO OU MAIS NUMERO DE LIBERTADORES QUE O ESTUDIANTES");
                System.out.println(timesDeFutebol.ceiling(Estudiantes));

                System.out.println("O PRIMEIRO TIME QUE TEM MAIS LIBERTADORES QUE O ESTUDIANTES");
                System.out.println(timesDeFutebol.higher(Estudiantes));


                System.out.println(timesDeFutebol.size());
                System.out.println(timesDeFutebol.pollFirst());
                System.out.println(timesDeFutebol.size());
                System.out.println(timesDeFutebol.pollLast());
                System.out.println(timesDeFutebol.size());
                


            }     
            

}
