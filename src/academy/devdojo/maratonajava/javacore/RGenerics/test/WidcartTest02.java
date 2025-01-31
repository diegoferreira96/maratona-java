package academy.devdojo.maratonajava.javacore.RGenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WidcartTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(gatos);
        printConsulta(cachorros);

        List<Animal> animals =  new ArrayList<>();
        printConsultaAnimal(animals);
        
    }

    public static void printConsulta(List<? extends Animal> animais){ // <? extends Animal> qualquer tipo de lista que seja Animal
        for (Animal animal : animais) {
            animal.consulta();
        }        
    } 
    
    
    private static void  printConsultaAnimal(List<? super Animal>animals){
        animals.add(new Gato());
        animals.add(new Cachorro());
    }

}
