package info.doula.inheritance;

/**
 * Created by tasnim on 12/5/2017.
 */
public class Inheritance3 implements E, F {
    @Override
    public void doSth() {
        F.super.doSth();
    }

    public static void main(String[] args) {
        new Inheritance3().doSth();
    }
}

interface E {
    default void doSth() {
        System.out.println("inside E");
    }
}

interface F {
    default void doSth() {
        System.out.println("inside F");
    }
}
