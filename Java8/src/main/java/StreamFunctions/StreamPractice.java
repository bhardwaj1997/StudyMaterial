package StreamFunctions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPractice {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 21, 1, 55, 88, 22, 65, 86, 28, 18, 21, 18);
    // list.stream().filter(n -> n %2 == 0).forEach(System.out::println);
    // list.stream().map(n -> n+"").filter(n -> n.startsWith("1")).forEach(System.out ::println);
    Set<Integer> set = new HashSet<>();
    // list.stream().filter(n -> !set.add(n)).forEach(System.out::println);
    // list.stream().findFirst().ifPresent(System.out::println);

    //  System.out.println(list.stream().count());
    // System.out.println(list.stream().max(Integer::compare).get());
    String str = "Java Hungry Blog Alive is Awesome";
//    str.chars()
//        .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
//        .collect(Collectors.);
  }
}
