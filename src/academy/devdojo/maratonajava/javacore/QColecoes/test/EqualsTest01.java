package academy.devdojo.maratonajava.javacore.QColecoes.test;

public class EqualsTest01 {
    public static void main(String[] args) {
        String nome = "Diego Ferreira";
        String nome2 = new String("Diego Ferreira");
        System.out.println(nome == nome2);
        System.out.println(nome.equals(nome2));
    }

}
