package academy.devdojo.maratonajava.javacore.RGenerics.test;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.RGenerics.service.BarcoRentavelService;

public class ClasseGenerericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService BarcoRentavelService = new BarcoRentavelService();
        Barco barco = BarcoRentavelService.buscaBarcoDisponivel();
        System.out.println("Usando o carro por um mês...");
        BarcoRentavelService.retornarBarcoAlugado(barco);        
    }

}
