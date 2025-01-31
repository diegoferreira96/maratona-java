package academy.devdojo.maratonajava.javacore.TParametrizandoComportamentos.interfaces;

import academy.devdojo.maratonajava.javacore.TParametrizandoComportamentos.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // anonimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green");
}
