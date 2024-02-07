package lambda;

import java.util.*;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class Alphastr {
    public static void main(String[] args) {
        List<String> s= Arrays.asList("sam","ram","shiva","alpha");
       // s.forEach(System.out::println);


        List<String> capitalizedList = s.stream()
                .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
                .sorted()
                .toList();

        System.out.println(capitalizedList);

    }
}
