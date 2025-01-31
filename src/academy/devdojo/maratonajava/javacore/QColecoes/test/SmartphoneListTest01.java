package academy.devdojo.maratonajava.javacore.QColecoes.test;

import java.util.ArrayList;
import java.util.List;
import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Smartphone;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC2", "TCL");
        Smartphone s3 = new Smartphone("1ABC3", "Motorola");
        Smartphone s4 = new Smartphone("1ABC4", "Samsung");
        Smartphone s5 = new Smartphone("1ABC5", "LG");
        Smartphone s6 = new Smartphone("1ABC6", "Xiaomi");
        Smartphone s7 = new Smartphone("1ABC7", "Lenovo");
        Smartphone s8 = new Smartphone("1ABC8", "Acer");
        
        List<Smartphone> smartphones = new ArrayList<>(64);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        smartphones.add(s4);
        smartphones.add(s5);
        smartphones.add(s6);
        smartphones.add(s7);
        smartphones.add(s8);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s9 = new Smartphone("1ABC8", "Acer");
        System.out.println(s9.equals(s8)); // pra saber se um objeto existe ou não na lista - true ou false.
        System.out.println(smartphones.contains(s9)); // pra saber se um objeto existe ou não na lista - true ou false.
        System.out.println(smartphones.indexOf(s9)); // possição no ArrayList. 
        System.out.println(smartphones.get(smartphones.indexOf(s9))); // Mostrando o objeto da lista
                
    }
        
           

}
