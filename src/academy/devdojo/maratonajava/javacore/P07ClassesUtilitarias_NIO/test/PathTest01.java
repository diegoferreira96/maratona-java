package academy.devdojo.maratonajava.javacore.P07ClassesUtilitarias_NIO.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
       Path p1 =  Paths.get("/media/usuario/Novo volume/Projetos/maratona-java/file.txt");
       Path p2 =  Paths.get("/media/usuario/Novo volume/Projetos/maratona-java","file.txt");
       Path p3 =  Paths.get("/media/usuario/Novo volume/","Projetos/maratona-java/file.txt");
       Path p4 =  Paths.get("/media/usuario/Novo volume/","Projetos/maratona-java/","file.txt");
       Path p5 =  Paths.get("/media/","usuario/","Novo volume/","Projetos/","maratona-java/","file.txt");
       System.out.println(p1.getFileName());
       System.out.println(p2.getFileName());
       System.out.println(p3.getFileName());
       System.out.println(p4.getFileName());
       System.out.println(p5.getFileName());
    }

}
