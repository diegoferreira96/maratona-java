package academy.devdojo.maratonajava.javacore.SClassesInternas.test;

public class OuterClassesTest02 {

    private String nome = "Midorya";

    void print(final String param){
        final String lastName = "Izuku";
        class localClass {
            public void printLocal(){
                System.out.println(param);
                System.out.println(nome+ " "+ lastName);
            } 
        }
        localClass localClass = new localClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outerClassesTest02 = new OuterClassesTest02();
        outerClassesTest02.print(" ");
    }

}
