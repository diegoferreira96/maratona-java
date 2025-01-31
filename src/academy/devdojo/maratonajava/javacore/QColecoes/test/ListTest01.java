package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Diego Ferreira");
        nomes.add("Sandro Vieria");
        nomes.add("Willian Suane");
        nomes.add("Willian Suane");
        nomes.add("Angelica Lages");
        nomes2.add("Diego Souza");
        nomes2.add("Sandro Leonardo");
        nomes2.add("Willian Bigode");
        nomes2.add("Maria da Conceição");        

        System.out.println("====================");

        nomes.addAll(nomes2); // adcionando os nomes de "nomes2" ao "nomes".
        System.out.println(nomes.remove("Sandro Vieria")); // retorna true ou false, se removeu.

        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        nomes.add("Severino Almeida");

        System.out.println("====================");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("======Removendo Duplicações======");
        Set<String> s = new LinkedHashSet<>(nomes);
        for (String nome : s) {
            System.out.println(nome);
        }


        
        
    }
}
