package lambda;

import java.util.List;

public class Liint {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,8,6,4,11,21);
        List<Integer> l1=l.stream()
                .filter(c->c%2!=0)
                .map(c->c*2)
                .toList();
        System.out.println(l1);
    }
}
