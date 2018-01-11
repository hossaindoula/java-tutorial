package info.doula.task;

public abstract class Xyz {
    abstract int min(int a, int b);

    public static void main(String[] args) {
        Xyz a = new A();
        Xyz b = new B();

        System.out.println(a.min(3,7)); //Dynamic Binding
        System.out.println(b.min(3,7)); //Dynamic Binding
    }
}

class A extends Xyz {

    int min(int a, int b) {
        return a - b;
    }
}

class B extends Xyz {

    int min(int a, int b) {
        return Math.abs(a - b);
    }
}