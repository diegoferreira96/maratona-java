package academy.devdojo.maratonajava.javacore.RGenerics.test;

abstract class Animal{
    public abstract void consulta();
}

class Cachorro extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consulta cachorro.");
    }
    
}

class Gato extends Animal{

    @Override
    public void consulta() {
        System.out.println("Consulta gato.");
    }
    
}

public class WidcartTest01 {    
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        printConsulta(cachorros);
        printConsulta(gatos);

        Animal[] animals = {new Cachorro(), new Gato()};
        Animal animal =  new Gato();
        printConsulta(animals);
    }

    public static void printConsulta(Animal[] animais){
        for (Animal animal : animais) {
            animal.consulta();
        }

    }

}
