package practiceprograms;

import java.util.ArrayList;

public class Rotation {
    public static void main(String[] args) {
        String s="abcd";
        char[] a=s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        //System.out.println(a);
        for (char c:a){
            list.add(c);
            System.out.println(c);

            System.out.println(list);

            //System.out.println(list.get(-1));
        }int l=list.size()-1;
        if(list.get(l) ==list.get(0)){

        }
        System.out.println(l);

    }
}
