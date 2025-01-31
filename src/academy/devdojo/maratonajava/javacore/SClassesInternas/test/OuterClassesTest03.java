package academy.devdojo.maratonajava.javacore.SClassesInternas.test;

public class OuterClassesTest03 {

    private String name = "Diego";

    static class Nested {

        private String lastName = "Ferreira";

        void print(){
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }    
        
    }
    public static void main(String[] args) {
        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        nested.print();
    }

}
