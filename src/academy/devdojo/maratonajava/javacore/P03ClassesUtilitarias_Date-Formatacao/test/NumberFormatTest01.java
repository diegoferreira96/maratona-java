import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getNumberInstance();
        nfa[1] = NumberFormat.getNumberInstance(localeJP);
        nfa[2] = NumberFormat.getNumberInstance(localeIT);
        nfa[3] = NumberFormat.getNumberInstance(localeBR);
        double valor = 10_000.2130;

        for (NumberFormat numberFormat : nfa){
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
