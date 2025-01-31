package academy.devdojo.maratonajava.javacore.ULambdas.dominio;

public class Anime {
    private String title;
    private int epsodes;


    public Anime(String title, int epsodes) {
        this.title = title;
        this.epsodes = epsodes;
    }
    


    @Override
    public String toString() {
        return "Anime [title=" + title + ", epsodes=" + epsodes + "]";
    }



    public String getTitle() {
        return title;
    }


    public int getepsodes() {
        return epsodes;
    }


    
    

}
