package info.doula.task;


public class Factorial {
    static int factorial(int number) {
        int fact = 1;
        for (int i = number; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }
    public static void main (String[] args) {
        //System.out.println(factorial(Integer.parseInt(args[0])));
        System.out.println(2 << 2);
    }
}