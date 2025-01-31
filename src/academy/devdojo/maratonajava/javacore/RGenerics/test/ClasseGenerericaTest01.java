package academy.devdojo.maratonajava.javacore.RGenerics.test;

import academy.devdojo.maratonajava.javacore.RGenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.RGenerics.service.CarroRentavelService;

public class ClasseGenerericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscaCarroDisponivel();
        System.out.println("Usando o carro por um mês...");
        carroRentavelService.retornarCarroAlugado(carro);
        
    }

}
