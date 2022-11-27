package pre.Functional.Interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo

{

    public static void main(String[] args) {
        Consumer<Integer> consumer = (t) -> System.out.println("Printing = " + t);
        consumer.accept(10);

        List<Integer> listint = Arrays.asList(1,2,3,4,5,6,7);
        listint.stream().forEach(consumer);
    }
}
