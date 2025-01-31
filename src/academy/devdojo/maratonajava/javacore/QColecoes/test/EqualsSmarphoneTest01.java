package academy.devdojo.maratonajava.javacore.QColecoes.test;

import academy.devdojo.maratonajava.javacore.QColecoes.dominio.Smartphone;

public class EqualsSmarphoneTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("1ABC1", "iphone");
        Smartphone s3  = s1;
        System.out.println(s1.equals(s2)); // comparação em memoria, como são objetos distintos vai dar false.
        System.out.println(s1.equals(s3));
    }

}
