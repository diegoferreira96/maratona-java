package academy.devdojo.maratonajava.javacore.RGenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Consumidor;

public class GenericTest01 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Diego Ferreira");
        

        for (String string : lista) {
            System.out.println(string);
        }

        add(lista, "Julio Balestrin");

        for (String string : lista) {
            System.out.println(string);
        }
    }

    public static void add(List lista, String consumidor){
            lista.add(consumidor);
    }

}
