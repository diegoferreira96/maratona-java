package academy.devdojo.maratonajava.javacore.ULambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

// Reference to on intance method of an arbitrary object of a particular type
public class MethodReferenceTest03 {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>(List.of("Diego", "Julio","Anderson"));
       list.sort(String::compareTo);
       System.out.println(list);
       
       Function<String, Integer> numStringInteger = Integer::parseInt;
       Integer num = numStringInteger.apply("10");
       System.out.println(num);

       BiPredicate<List, String> checkName = List::contains;
       System.out.println(checkName.test(list,"Diego"));
    }

}
