package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listr {
    public static void main(String[] args) {
        Listr l=new Listr();
        String[] s=l.stso();
        for (String se:s)
             System.out.println(se);


    }
    public String[] stso(){
        List<String> s1=List.of("SAm","Ramhkjb","Ravi","Ali","Apple","Amir");

        List<String> re=s1.stream()
                .filter(s->s.length()>1 && s.charAt(0)=='A')
                .toList();

        System.out.println(re.getClass());
        String[] s={"Ram"};
        String[] a= re.toArray(new String[0]);

        return a;


    }
}
