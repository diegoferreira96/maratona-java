package academy.devdojo.maratonajava.javacore.P07ClassesUtilitarias_NIO.test;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {

    public class FindAllTestJavaOrClass extends SimpleFileVisitor<Path> {
        private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*{**/*Test*}.{java,class}");

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if (matcher.matches(file)) {
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }       
    
        
    }
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
       // Files.walkFileTree(root, new FindAllTestJavaOrClass()); erro
         
    }    

}
