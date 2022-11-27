package pre.Functional.Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Supplier<List<Integer>> supplier = ()-> Arrays.asList(1,2,3,4,5,6);
        System.out.println("supplier.get() = " + supplier.get());
        supplier.get().stream().filter((t)->t%2==0).forEach((t)-> System.out.println("t = " + t));

Supplier<String> test= ()-> "hello this is supplier test";
       // List<String> list1 = Arrays.asList("a","b");
        List<String> list1 = Arrays.asList();
        System.out.println("list1.stream().findAny().orElse() = " + list1.stream().findAny().orElse(test.get()));

    }
}
