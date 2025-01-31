package academy.devdojo.maratonajava.javacore.ULambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

import javax.swing.SizeRequirements;

import academy.devdojo.maratonajava.javacore.ULambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ULambdas.service.AnimeComparators;

public class MethodReferenceTest04 {
    //Reference to a constructor
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparators.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43),new Anime("One piece", 900),new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpsodesNoStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        System.out.println(animeBiFunction.apply("Naruto", 975));

        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super Campeoes", 36));
        
    }

}
