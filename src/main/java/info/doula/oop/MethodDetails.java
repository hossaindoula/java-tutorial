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
public class MethodDetails {
    
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = sum(5, 6);
        int b = sum(sum(7, 2), a);

        System.out.println("The value of a is : " + a);
        System.out.println("The value of b is : " + b);
    }

 
}