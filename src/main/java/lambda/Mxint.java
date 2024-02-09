package lambda;

import java.util.List;
import java.util.OptionalInt;

public class Mxint {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,8,6,-9,-7,4,11,21);
        OptionalInt l1=l.stream()
                .filter(c->c>0)
                .sorted()
                .mapToInt(Integer::intValue)
                .max();
        System.out.println(l1);
    }
}
