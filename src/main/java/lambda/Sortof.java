package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sortof {
    public static void main(String[] args) {
        List<String> s= List.of("TOMATO");
        Map<Character, Long> charCounts = s.stream()
                .flatMapToInt(CharSequence::chars)
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,Collectors.counting()));

        System.out.println("Character Counts:");



        System.out.println(charCounts);
        //charCounts.forEach((character, count) -> System.out.println(character + ": " + count));





    }
}
