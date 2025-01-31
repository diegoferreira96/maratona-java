package academy.devdojo.maratonajava.javacore.P07ClassesUtilitarias_NIO.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/diego/dev/file.txt");
        PosixFileAttributes posixFileAttributes = Files.readAttributes(path,PosixFileAttributes.class);
        System.out.println(posixFileAttributes.permissions());  
        FileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
         Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw");
        ((PosixFileAttributeView) fileAttributeView).setPermissions(posixFilePermissions);
        System.out.println(((PosixFileAttributeView) fileAttributeView).readAttributes().permissions());

    }

}
