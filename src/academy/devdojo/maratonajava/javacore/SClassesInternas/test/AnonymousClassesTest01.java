package academy.devdojo.maratonajava.javacore.SClassesInternas.test;

class Animal{
    public void walk(){
    System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ // classe anonima
            @Override
            public void walk() {
                System.out.println("Cachorro walking");
            }                         
        };
        animal.walk();
    }

}
