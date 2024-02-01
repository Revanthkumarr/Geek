package practiceprograms;

import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;

public class Repeated {
    public static void main(String[] args) {
        Repeated r=new Repeated();
        String s1="ramuram";
        Map<Character, Integer> counts = r.cont(s1);
        System.out.println("char cou");
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue()>1) {
                System.out.print(entry.getKey());
            }
        }
    }
    public Map<Character, Integer> cont(String s){
        Map<Character, Integer> co=new HashMap<>();
        for(char ch:s.toCharArray()){
            co.put(ch,co.getOrDefault(ch,0)+1);

        }
        return co;
    }

    }

