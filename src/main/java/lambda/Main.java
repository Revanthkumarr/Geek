package lambda;

public class Main extends Functionalinter{
    public static void main(String[] args) {
        MyFunctionalInterface functionalInterface = (a,b) -> System.out.println(a+b);
        functionalInterface.myMethod(5,10);
    }
}
