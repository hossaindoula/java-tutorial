package info.doula.oop;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Calculation {

    /**
     * One part of Polymorphism is method overloading where method name
     * would be same but different parameters could be provided
     */
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        /*if (args.length == 2)
            System.out.println("The summation of "+ args[0] + " and "+ args[1] +" is : " 
            + calculation.sum(parseInt(args[0]), parseInt(args[1])));

        if (args.length == 4)
            System.out.println("The summation of " + args[0] +", "+ args[1] +", "+ args[2] +" and "+ args[3] +" is : " 
            + calculation.sum(parseInt(args[0]), parseInt(args[1]),
                parseInt(args[2]), parseInt(args[3])));*/

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n);


    }
}