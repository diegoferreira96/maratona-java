package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(); //Map<Chave, Valor>
        map.put("tecklado", "teclado");
        map.put("mouze", "mouse");
        map.put("loko", "louco");
        map.putIfAbsent("loko2", "louco2");
        
        System.out.println(map);

        System.out.println("-----------------------");

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));            
        }

        System.out.println("-----------------------");
        
        for (String values : map.values()) {
            System.out.println(values);            
        }

        System.out.println("-----------------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
