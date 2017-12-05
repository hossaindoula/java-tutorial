package info.doula.inheritance;

/**
 * Created by tasnim on 12/5/2017.
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