package academy.devdojo.maratonajava.javacore.RGenerics.service;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Carro;

public class RentalService<T> { // T => tipo
    private List<T> objetosDisponiveis;

    public RentalService(List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscaObjetoDisponivel(){
        System.out.println("Buscando objeto disponivel");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando objeto: " + t);
        System.out.println("Objetos disponiveis para alugar");
        System.out.println(objetosDisponiveis);
        return t;
    }

    public void retornarObjetoAlugado(T t){
        System.out.println("Devolvendo objeto " + t);
        objetosDisponiveis.add(t);
        System.out.println("Objetos disponiveis para alugar: ");
        System.out.println(objetosDisponiveis);
    }

}
