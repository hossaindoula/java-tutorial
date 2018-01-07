package info.doula.inheritance;

/**
 * Mohammed Hossain Doula
 *
 * @hossaindoula | @itconquest
 * <p>
 * http://hossaindoula.com
 * <p>
 * https://github.com/hossaindoula
 */
public class Inheritance2 implements B, D {
    public static void main(String[] args) {
        new Inheritance2().doSth();
    }
}

interface B {
    default void doSth() {
        System.out.println("inside B");
    }
}

interface D extends B {
    default void doSth() {
        System.out.println("inside D");
    }
}

