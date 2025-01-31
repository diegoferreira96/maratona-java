package academy.devdojo.maratonajava.javacore.P07ClassesUtilitarias_NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/diego");
        Path classePath = Paths.get("/home/diego/devdojofoda/OlaMundo.java");
        Path pathToClasse = dir.relativize(classePath);
        System.out.println(pathToClasse);

        Path absoluto1 = Paths.get("/home/diego");
        Path absoluto2 = Paths.get("/sr/local");
        Path absoluto3 = Paths.get("/home/diego/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 "+absoluto1.relativize(absoluto3));
        System.out.println("2 "+absoluto3.relativize(absoluto1));
        System.out.println("3 "+absoluto1.relativize(absoluto2));
        System.out.println("4 "+relativo1.relativize(relativo2));
        System.out.println("5 "+absoluto1.relativize(relativo1));        
    }

}
