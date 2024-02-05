package practiceprograms;

import java.net.StandardSocketOptions;

public class Bubb {
    public static void main(String[] args) {
        String s="sam";
        String s1="aas";
        char[] os=s.toCharArray();
        char[] ts=s1.toCharArray();
        int j=0;


        for(int i=os.length-1;i>=0;i--){
            if(os[i]==ts[j]){
                j++;
                //i--;



            }
            else {
                break;
            }
            }
        if(j==os.length){
            System.out.println("s=s1");
        }
        else {
            System.out.println("s!=s1");
        }

        }

        }







