package academy.devdojo.maratonajava.javacore.WEstreams.dominio;

public class LightNovel {
    private String title;
    private double price;    
    private Category category;    


    @Override
    public String toString() {
        return "LightNovel [title=" + title + ", price=" + price + ", category=" + category + "]";
    }


    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }   


    public LightNovel(String title, double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }


    public String getTitle() {
        return title;
    }


    public double getPrice() {
        return price;
    }


    public Category getCategory() {
        return category;
    }          
    

}
