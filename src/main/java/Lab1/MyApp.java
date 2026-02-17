package Lab1;
import Lab1.Mylibrary;

public class MyApp {
    public static void main(String[] args) {
        int num1 = 2;
        int exp = 4;

        System.out.println(" Factorial of " + num1 + " : " + Mylibrary.factorial(num1));
        System.out.println(" "+ num1 + "power of "+ exp + "will be "+ Mylibrary.Power(num1, exp));
    }
}

