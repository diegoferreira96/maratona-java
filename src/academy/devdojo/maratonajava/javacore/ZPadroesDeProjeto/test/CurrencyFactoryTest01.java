package academy.devdojo.maratonajava.javacore.ZPadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZPadroesDeProjeto.dominio.Country;
import academy.devdojo.maratonajava.javacore.ZPadroesDeProjeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZPadroesDeProjeto.dominio.CurrencyFactory;

public class CurrencyFactoryTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
