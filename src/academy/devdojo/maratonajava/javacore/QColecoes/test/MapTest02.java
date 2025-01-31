package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.HashMap;
import java.util.Map;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.QColecoes.dominio.TimesFutebol;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor(null, "Diego Ferreira");
        Consumidor consumidor2 = new Consumidor(null, "William Suane");

        TimesFutebol camisaTime1 = new TimesFutebol(10101L, "CORINTHIANS", 3429.9);
        TimesFutebol camisaTime2 = new TimesFutebol(10102L, "PALMEIRAS", 9532.6);
        TimesFutebol camisaTime3 = new TimesFutebol(10103L, "SÃO PAULO", 4825.2);
        TimesFutebol camisaTime4 = new TimesFutebol(10104L, "SANTOS", 4149.4);
        TimesFutebol camisaTime5 = new TimesFutebol(10105L, "FLAMENGO", 8183.5);

        Map<Consumidor, TimesFutebol> consumidorCamisaTime = new HashMap<>();
        consumidorCamisaTime.put(consumidor1, camisaTime1);
        consumidorCamisaTime.put(consumidor2, camisaTime3);
        

        for (Map.Entry<Consumidor, TimesFutebol> entry : consumidorCamisaTime.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());            
        }
        
        System.out.println(consumidor1.getNome());
    }

}
