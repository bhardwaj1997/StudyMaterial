package pre.Functional.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println("Printing Even = " + t);

        Predicate<Integer> predicate = (t)-> t%2 ==0 ;
        System.out.println("predicate.test(10) = " + predicate.test(10));

        List<Integer> listint = Arrays.asList(1,2,3,4,5,6,7);
        listint.stream().filter(predicate).forEach(consumer);
    }
}


