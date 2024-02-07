package lambda;

import java.util.Arrays;
import java.util.List;

public class Vowles {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        strings.stream()
                .filter(s -> s.matches(".*[aeiou].*")) 
                .forEach(s -> {
                    long vowelCount = s.chars().filter(c -> "aeiou".indexOf(c) != -1).count(); 
                    System.out.println(s + " - Vowel Count: " + vowelCount);
                });
        
    }
}
