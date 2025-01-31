package academy.devdojo.maratonajava.javacore.ULambdas.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.ULambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ULambdas.service.AnimeComparators;

// Reference to on intance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
       AnimeComparators animeComparators = new AnimeComparators();
       List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),new Anime("One piece", 900),new Anime("Naruto", 500)));
       animeList.sort(animeComparators::compareByEpsodesNoStatic);
       System.out.println(animeList);
    }

}
