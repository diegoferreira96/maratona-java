package academy.devdojo.maratonajava.javacore.P06ClassesUtilitarias_IO.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    private static boolean mkdir;

    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("arquivo");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println(isDiretorioCreated);

        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo.txt");
        boolean isFiledCriado = fileArquivoDiretorio.createNewFile();
        System.out.println(isFiledCriado);

        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);

        File diretorioRenamed = new File("arquivo2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }

}
