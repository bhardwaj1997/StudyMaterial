package StreamFunctions;

import java.util.*;

public class ForEach {

    private static List<String> list;

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Sumit", "Kuldeep", "John");

        list.stream().filter(s -> s.endsWith("p")).forEach(t-> System.out.println("t = " + t));
        list.stream().forEach(t -> System.out.println("t = " + t));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "E");
        map.put(2, "p");
        map.put(3, "H");
        map.put(4, "D");
        map.forEach((key, val) -> System.out.println(key + "=" + val));
        map.entrySet().stream().filter(t->t.getKey()%2==0).forEach(obj-> System.out.println("filter obj = " + obj));
        map.entrySet().forEach(obj -> System.out.println(obj));
        map.keySet().forEach(obj -> System.out.println(obj));
    }
}
