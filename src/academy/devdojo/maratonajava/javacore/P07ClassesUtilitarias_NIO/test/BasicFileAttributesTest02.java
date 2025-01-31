package academy.devdojo.maratonajava.javacore.P07ClassesUtilitarias_NIO.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        // BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        // Tudo que contem View é feito para fazer alterações
        Path path = Paths.get("pasta2/new.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lasModifiedTime = basicFileAttributes.lastAccessTime();
        FileTime lasAceesTime =  basicFileAttributes.lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lasModifiedTime "+lasModifiedTime);
        System.out.println("lasAceesTime "+lasAceesTime);
        
        System.out.println("=================================");
        
        BasicFileAttributeView fileBasicFileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileBasicFileAttributeView.setTimes(lasModifiedTime,newCreationTime,creationTime);

        creationTime = fileBasicFileAttributeView.readAttributes().creationTime();
        lasModifiedTime = fileBasicFileAttributeView.readAttributes().lastAccessTime();
        lasAceesTime =  fileBasicFileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime "+creationTime);
        System.out.println("lasModifiedTime "+lasModifiedTime);
        System.out.println("lasAceesTime "+lasAceesTime);
    }

}
