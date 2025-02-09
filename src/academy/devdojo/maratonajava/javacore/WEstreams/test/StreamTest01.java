package academy.devdojo.maratonajava.javacore.WEstreams.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import academy.devdojo.maratonajava.javacore.WEstreams.dominio.LightNovel;

public class StreamTest01 {

    // 1. Order LightNovel by title
    // 2. Retrieve the first 3 light novels with price less than 4

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(  
                                                                            new LightNovel("Tensei Shittara", 8.99), 
                                                                            new LightNovel("Overlord", 3.99),
                                                                            new LightNovel("Violet Evergarden", 5.99),
                                                                            new LightNovel("No Game no life", 2.99),
                                                                            new LightNovel("Full Metal", 5.99),
                                                                            new LightNovel("Kumo desuga", 1.99),
                                                                            new LightNovel("Monogatari", 4.00)));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }

            
            System.out.println(titles);
            System.out.println("=========================");
        }
    }

}
