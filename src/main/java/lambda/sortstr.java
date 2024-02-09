package lambda;

import java.util.*;
import java.util.stream.Collectors;

public class sortstr {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("Hello", "Hii", "Ramu", "ellla", "Samuji");
        String[] array = list1.toArray(new String[0]);

        Comparator<String> st = (s1, s2) -> {
            int lengthcom = Integer.compare(s1.length(), s2.length());
            if (lengthcom != 0) {
                return lengthcom;
            }
            return Character.compare(s2.charAt(s2.length() - 1), s1.charAt(s1.length() - 1));
        };
        Arrays.sort(array, st);
        //System.out.println(array);
        for (String str : array) {
            System.out.println(str);

        }
        }
    }





