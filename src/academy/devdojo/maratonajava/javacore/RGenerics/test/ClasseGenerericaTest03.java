package academy.devdojo.maratonajava.javacore.RGenerics.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.RGenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.RGenerics.service.RentalService;

public class ClasseGenerericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("GUANABARA"),new Barco("GUARUJA")));

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);    
        Carro carro = rentalService.buscaObjetoDisponivel();
        System.out.println("Usando o carro por um mês...");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("================================================");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscaObjetoDisponivel();
        System.out.println("Usando o barco por um mês...");
        rentalService2.retornarObjetoAlugado(barco);
    }

}
