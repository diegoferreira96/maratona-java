import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguagem = Locale.getISOLanguages();

        for (String isoLanguage : isoLanguagem){
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry : isoCountries){
            System.out.print(isoCountry + " ");
        }
    }
}
