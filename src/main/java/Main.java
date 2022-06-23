// import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // your code here
        boolean trueVar = true;
        boolean falseVar = false;

        System.out.println("Truth Table for && Operator");
        System.out.println("true && true = " + (trueVar && trueVar));
        System.out.println("true && false = " + (trueVar && falseVar));
        System.out.println("false && false = " + (falseVar && falseVar));
        System.out.println("false && true = " + (falseVar && trueVar));

        System.out.println("Truth Table for || Operator");
        System.out.println("true || true = " + (trueVar || trueVar));
        System.out.println("true || false = " + (trueVar || falseVar));
        System.out.println("false || false = " + (falseVar || falseVar));
        System.out.println("false || true = " + (falseVar || trueVar));       
    }
}