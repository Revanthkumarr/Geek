package practiceprograms;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1)  {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
