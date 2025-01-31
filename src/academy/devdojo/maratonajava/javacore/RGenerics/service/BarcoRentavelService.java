package academy.devdojo.maratonajava.javacore.RGenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Barco;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("GUANABARA"),new Barco("GUARUJA")));

    public Barco buscaBarcoDisponivel(){
        System.out.println("Buscando Barco disponivel");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco: " + barco);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo Barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }


}
