package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Oddsqav {
    public static void main(String[] args) {
        //int[] a={2,5,9,11,4,6};
      /* List<Integer> i= Arrays.asList(2,5,9,11,4,6);
       List<Integer> in=i.stream()
               .filter(n->n%2!=0)
               .map(n -> n * n)
               .collect(Collectors.summingInt(Integer::intValue));*/
        List<Integer> numbers = Arrays.asList(2,9,8,7,5,11,13);


        long sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .mapToInt(Integer::intValue)
                .sum();
        long cou = numbers.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .count();
        long f=sum/cou;


        System.out.println(f);

    }
}
