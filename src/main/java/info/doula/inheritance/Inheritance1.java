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
public class Inheritance1 implements A {
    @Override
    public void doSth() {
        System.out.println("inside Inheritance1");
    }

    public static void main(String[] args) {
        new Inheritance1().doSth();
    }
}

interface A {
    default void doSth() {
        System.out.println("inside A");
    }
}
