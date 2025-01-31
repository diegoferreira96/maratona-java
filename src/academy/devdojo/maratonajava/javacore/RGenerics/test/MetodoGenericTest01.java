package academy.devdojo.maratonajava.javacore.RGenerics.test;

import java.util.List;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Barco;

public class MetodoGenericTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarUmArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);
        
    }

    private static <T> List<T> criarUmArrayComUmObjeto(T t){
        return List.of(t);
    }

    /*
        private static <T extends Comparable <T>> List<T> criarUmArrayComUmObjeto(T t){
            return List.of(t);
        }
    */    

}
