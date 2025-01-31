package academy.devdojo.maratonajava.javacore.SClassesInternas.test;

public class OuterClassesTest01 {

    private String name = "Diego dos Santos Ferreira de Souza";

    // Nested
    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }
    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        inner.printOuterClassAttribute();

        System.out.println("==========================");

        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAttribute();
    }

}
