import java.lang.Math;

public class calculation {
    static int add (int a, int b) {
        return a + b;
    }

    static int subtract (int a, int b) {
        return a - b;
    }

    static int multiply (int a, int b) {
        return a * b;
    }

    static double divide (double a, double b) {
        if (a == 0 || b == 0)
            return 0;
        return a / b;
    }

    static double power (double a, double b) {
        return Math.pow(a, b);
    }

    static double square (double a) {
        return a * a;
    }

    static double squareRoot (double a) {
        return Math.sqrt(a);
    }

    static void fibonacci () {
        int limit = 10;
        int first = 0;
        int second = 1;
        int sum;
        for (int i = 2; i <= limit; i++) {
            System.out.println(first);
            sum = first + second;
            first = second;
            second = sum;
        } 
    }


    public static void main(String[] args) {
        System.out.println("Simple Calculation");
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Subtraction: " + subtract(10, 5));
        System.out.println("Multiplication: " + multiply(10, 5));
        System.out.println("Division: " + divide(10, 0));
        System.out.println("Power: " + power(5, 2));
        System.out.println("Square: " + square(3));
        System.out.println("Square Root: " + squareRoot(9));
        fibonacci();
    }
}