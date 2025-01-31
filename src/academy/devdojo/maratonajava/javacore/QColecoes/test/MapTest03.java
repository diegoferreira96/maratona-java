package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor(null, "Diego Ferreira");
        Consumidor consumidor2 = new Consumidor(null, "William Suane");

        TimesFutebol camisaTime1 = new TimesFutebol(10101L, "CORINTHIANS", 3429.9);
        TimesFutebol camisaTime2 = new TimesFutebol(10102L, "PALMEIRAS", 9532.6);
        TimesFutebol camisaTime3 = new TimesFutebol(10103L, "SÃO PAULO", 4825.2);
        TimesFutebol camisaTime4 = new TimesFutebol(10104L, "SANTOS", 4149.4);
        TimesFutebol camisaTime5 = new TimesFutebol(10105L, "FLAMENGO", 8183.5);
        TimesFutebol camisaTime6 = new TimesFutebol(10106L, "BOTAFOGO", 1296.2);
        TimesFutebol camisaTime7 = new TimesFutebol(10107L, "VASCO", 676.9);
        TimesFutebol camisaTime8 = new TimesFutebol(10108L, "FLUMINENSE", 4502.2);
        
        List<TimesFutebol> timesConsumidor1List = List.of(camisaTime1, camisaTime5, camisaTime6, camisaTime7, camisaTime8);
        List<TimesFutebol> timesConsumidor2List = List.of(camisaTime2, camisaTime3, camisaTime4);
        Map<Consumidor, List<TimesFutebol>> consumidorCamisaTimeMap = new HashMap<>();
        consumidorCamisaTimeMap.put(consumidor1, timesConsumidor1List);
        consumidorCamisaTimeMap.put(consumidor2, timesConsumidor2List);

        for (Map.Entry<Consumidor, List<TimesFutebol>> entry : consumidorCamisaTimeMap.entrySet()) {
            System.out.println("=========" + entry.getKey().getNome() + "=========");
            for (TimesFutebol timesFutebol : entry.getValue()) {
                System.out.println(timesFutebol.getNome());
            }
        }

    }

}
