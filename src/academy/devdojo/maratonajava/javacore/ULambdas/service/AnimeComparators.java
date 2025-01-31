package academy.devdojo.maratonajava.javacore.ULambdas.service;

import academy.devdojo.maratonajava.javacore.ULambdas.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpsodes(Anime a1, Anime a2){
        return Integer.compare(a1.getepsodes(), a2.getepsodes());
    }
    
    public int compareByEpsodesNoStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getepsodes(), a2.getepsodes());
    }
}
