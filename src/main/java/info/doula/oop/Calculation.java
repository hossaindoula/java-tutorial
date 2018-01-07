package info.doula.oop;

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

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    
    static int sum(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    public static void main(String[] args) {
        System.out.println("The summation of 5 and 9 is : " + sum(5, 9));
        System.out.println("The summation of 10, 9, 18 and 20 is : " + sum(10, 9, 18, 20));
    }
}