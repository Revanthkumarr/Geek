package lambda;

import java.util.List;
import java.util.OptionalInt;

public class Ssurae {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,8,6,-9,-7,4,11,21);
        int l1=l.stream()
                .filter(c->c>0)
                .map(c->c*c)
                .mapToInt(Integer::intValue)
                .sum();


        System.out.println(l1);

    }
}
